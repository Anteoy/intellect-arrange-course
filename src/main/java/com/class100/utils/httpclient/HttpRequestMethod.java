package com.class100.utils.httpclient;

import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by zhoudazhuang on 17-11-7.
 */
public class HttpRequestMethod {

    private static int TIMEOUT = 50000;            // -1 时永不超时，这里默认50秒


    public static HttpUriRequest getHttpGet(String url) {
        return getHttpUriRequest("GET", url, null, TIMEOUT);
    }

    public static HttpUriRequest getHttpGet(String url, int timeout) {
        return getHttpUriRequest("GET", url, null, timeout);
    }

    public static HttpUriRequest getHttpGet(String url, Map<String, String> headers, int timeout) {
        return getHttpUriRequest("GET", url, headers, timeout);
    }

    public static HttpUriRequest getHttpPost(String url, Map<String, String> params) {
        return getHttpUriRequest("POST", url, null, params, TIMEOUT);
    }

    public static HttpUriRequest getHttpPost(String url, Map<String, String> params, int timeout) {
        return getHttpUriRequest("POST", url, null, params, timeout);
    }

    public static HttpUriRequest getHttpPost(String url, Map<String, String> headers, Map<String, String> params, int timeout) {
        return getHttpUriRequest("POST", url, headers, params, timeout);
    }


    /**
     * 请求
     *
     * @param method  请求方法
     * @param url     请求url
     * @param headers 请求头
     * @param timeout 超时时间
     * @return
     */
    public static HttpUriRequest getHttpUriRequest(String method, String url, Map<String, String> headers, int timeout) {
        return getHttpRequest(method, url, headers, null, timeout);
    }

    /**
     * 请求
     *
     * @param method  请求方法
     * @param url     请求url
     * @param headers 请求头
     * @param params  json形式参数
     * @param timeout 超时时间
     * @return
     */
    public static HttpUriRequest getHttpUriRequest(String method, String url, Map<String, String> headers, String params, int timeout) {
        return getHttpRequest(method, url, headers, makeStringEntity(params), timeout);
    }

    /**
     * 请求
     *
     * @param method  请求方法
     * @param url     请求url
     * @param headers 请求头
     * @param params  map形式参数
     * @param timeout 超时时间
     * @return
     */
    public static HttpUriRequest getHttpUriRequest(String method, String url, Map<String, String> headers, Map<String, String> params, int timeout) {
        return getHttpRequest(method, url, headers, makeStringEntity(params), timeout);
    }


    private static HttpUriRequest getHttpRequest(String method, String url, Map<String, String> headers, StringEntity entity, int timeout) {
        RequestBuilder requestBuilder = selectRequestMethod(method, entity).setUri(url);
        if (headers != null && headers.size() > 0) {
            for (Map.Entry<String, String> headerEntry : headers.entrySet()) {
                requestBuilder.addHeader(headerEntry.getKey(), headerEntry.getValue());
            }
        }
        timeout = timeout == 0 ? TIMEOUT : timeout;
        RequestConfig.Builder requestConfigBuilder = RequestConfig.custom()
                .setConnectionRequestTimeout(timeout)
                .setSocketTimeout(timeout)
                .setConnectTimeout(timeout);
        requestBuilder.setConfig(requestConfigBuilder.build());
        return requestBuilder.build();
    }


    private static RequestBuilder selectRequestMethod(String method, StringEntity entity) {
        if (method == null || method.equalsIgnoreCase("GET")) {
            return RequestBuilder.get().setCharset(Charset.forName("UTF-8"));        //default get
        } else if (method.equalsIgnoreCase("POST")) {
            RequestBuilder requestBuilder = RequestBuilder.post().setCharset(Charset.forName("UTF-8"));
            if (entity != null) {
                requestBuilder.setEntity(entity);
            }
            return requestBuilder;
        }
        throw new IllegalArgumentException("Illegal HTTP Method " + method);
    }

    private static StringEntity makeStringEntity(Map<String, String> params) {
        StringEntity entity = null;
        if (params != null && params.size() > 0) {
            List<NameValuePair> paramsList = new ArrayList<NameValuePair>();
            for (Map.Entry<String, String> param : params.entrySet()) {
                paramsList.add(new BasicNameValuePair(param.getKey(), param.getValue()));
            }
            entity = new UrlEncodedFormEntity(paramsList, Charset.forName("UTF-8"));
        }
        return entity;
    }

    private static StringEntity makeStringEntity(String params) {
        StringEntity entity = null;
        if (params != null) {
            entity = new StringEntity(params, Charset.forName("UTF-8"));
        }
        return entity;
    }

}

