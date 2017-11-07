package com.class100.utils;

import io.netty.channel.ConnectTimeoutException;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContextBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Created by zhoudazhuang on 17-11-7.
 */
@SuppressWarnings("deprecation")
public class HttpClientUtils {

    private final static Logger LOGGER = LoggerFactory.getLogger(HttpClientUtils.class);

    private static HttpClientBuilder httpClientBuilder;

    private static CloseableHttpClient httpClient;

    private static PoolingHttpClientConnectionManager connMgr;


    static {
        //加载类时初始化
        init();
    }


    private static void init() {
        httpClientBuilder = HttpClientBuilder.create();
        SSLContext sslContext = null;
        try {
            sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
                public boolean isTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
                    return true;
                }
            }).build();
        } catch (NoSuchAlgorithmException e) {
            LOGGER.error(e.getMessage(),e);
        } catch (KeyManagementException e) {
            LOGGER.error(e.getMessage(),e);
        } catch (KeyStoreException e) {
            LOGGER.error(e.getMessage(),e);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
        }
        httpClientBuilder.setSslcontext(sslContext);

        HostnameVerifier hostnameVerifier = NoopHostnameVerifier.INSTANCE;

        SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(sslContext, hostnameVerifier);
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
                .register("http", PlainConnectionSocketFactory.getSocketFactory()).register("https", sslSocketFactory).build();
        connMgr = new PoolingHttpClientConnectionManager(socketFactoryRegistry);

        connMgr.setMaxTotal(400);
        connMgr.setDefaultMaxPerRoute(connMgr.getMaxTotal());
        httpClientBuilder.setConnectionManager(connMgr);
        httpClientBuilder.setRetryHandler(new DefaultHttpRequestRetryHandler());
    }


    /***
     * 获取httpClient实例，全局一个实例
     * */
    public static CloseableHttpClient getHttpClient() {
        if (httpClient == null) {
            synchronized(HttpClientUtils.class){
                if (httpClient == null) {
                    httpClient = httpClientBuilder.build();
                }
            }
        }
        return httpClient;
    }


    /**
     * 创建RequestConfig配置
     * @param timeout 超时时间
     * */
    public static RequestConfig createRequestConfig(int timeout) {
        return RequestConfig.custom().setConnectionRequestTimeout(timeout)
                .setConnectTimeout(timeout)
                .setSocketTimeout(timeout)
                .build();
    }


    /***
     * http请求重试处理器
     * */
    private static class DefaultHttpRequestRetryHandler implements HttpRequestRetryHandler {

        public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
            if (executionCount >= 3) {// 如果已经重试了3次，就放弃
                return false;
            }
            if (exception instanceof NoHttpResponseException) {// 如果服务器丢掉了连接，那么就重试
                return true;
            }
            if (exception instanceof SSLHandshakeException) {// 不要重试SSL握手异常
                return false;
            }
            if (exception instanceof InterruptedIOException) {//
                return false;
            }
            if (exception instanceof UnknownHostException) {// 目标服务器不可达
                return false;
            }
            if (exception instanceof ConnectTimeoutException) {// 连接被拒绝
                return false;
            }
            if (exception instanceof SSLException) {// SSL握手异常
                return false;
            }

            HttpClientContext clientContext = HttpClientContext
                    .adapt(context);
            HttpRequest request = clientContext.getRequest();
            // 如果请求是幂等的，就再次尝试
            if (!(request instanceof HttpEntityEnclosingRequest)) {
                return true;
            }
            return false;
        }}
}
