package com.class100.utils.httpclient;

import com.class100.model.HttpResultPoJo;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhoudazhuang on 17-11-7.
 */
public class HttpClientHandle {
    private static final Logger LOGGER = LoggerFactory.getLogger(HttpClientHandle.class);

    private static String CHARSET_UTF8 = "UTF-8";
    public static HttpResultPoJo connect(CloseableHttpClient httpClient, HttpUriRequest httpUriRequest) {
        return connect(httpClient, httpUriRequest, CHARSET_UTF8);
    }

    //连接http 开始发送http请求
    public static HttpResultPoJo connect(CloseableHttpClient httpClient, HttpUriRequest httpUriRequest, String charset) {
        return execute(httpClient, httpUriRequest, charset);
    }

    /**
     * 执行请求
     *
     * @param httpClient
     * @param httpUriRequest
     * @return
     */
    private static HttpResultPoJo execute(CloseableHttpClient httpClient, HttpUriRequest httpUriRequest, String charset) {
        HttpResultPoJo result = null;
        HttpResponse response = null;
        HttpEntity entity = null;
        try {
            LOGGER.info("monitorMsg{}", new StringBuffer("外部接口HTTP调用开始，请求地址 url：").append(httpUriRequest.getURI()).toString(), "");
            response = httpClient.execute(httpUriRequest);
            int statusCode = response.getStatusLine().getStatusCode();
            result = new HttpResultPoJo();
            result.setStatusCode(statusCode);
            if (statusCode == HttpStatus.SC_OK) {
                entity = response.getEntity();
                if (entity == null) {
                    result.setResmsg(response.getStatusLine().getReasonPhrase());
                    LOGGER.error("monitorMsg{}",  new StringBuffer("外部接口HTTP调用返回数据为null，请求地址 url：").append(httpUriRequest.getURI()).toString(), "");
                } else {
                    String content = EntityUtils.toString(entity, charset);
                    result.setData(content);
                    LOGGER.info("monitorMsg{}", new StringBuffer("外部接口HTTP调用成功，状态码：").append(statusCode).append("，请求地址 url：").append(httpUriRequest.getURI()).toString(), "");
                }
            } else {
                entity = response.getEntity();
                if (entity == null) {
                    result.setResmsg(response.getStatusLine().getReasonPhrase());
                    LOGGER.error("monitorMsg{}",  new StringBuffer("外部接口HTTP调用返回数据为null，请求地址 url：").append(httpUriRequest.getURI()).toString(), "");
                } else {
                    String content = EntityUtils.toString(entity, charset);
                    result.setData(content);
                    LOGGER.info("monitorMsg{}", new StringBuffer("外部接口HTTP调用成功，状态码：").append(statusCode).append("，请求地址 url：").append(httpUriRequest.getURI()).toString(), "");
                }
                String msg = response.getStatusLine().getReasonPhrase();
                result.setResmsg(msg);
                LOGGER.info("monitorMsg{}",  new StringBuffer("外部接口HTTP调用失败，状态码：").append(statusCode).append("，请求地址 url：").append(httpUriRequest.getURI()).toString(), msg);
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            LOGGER.info("monitorMsg{}",  new StringBuffer("外部接口HTTP调用异常：").append(e.toString()).append("，请求地址 url：").append(httpUriRequest.getURI()).toString(), "");
        } finally {
            try {
                httpUriRequest.abort();
                if (response != null) {
                    EntityUtils.consume(response.getEntity());
                }
            } catch (Exception e) {
                LOGGER.error(e.getMessage(), e);
            }
        }

        return result;
    }


}

