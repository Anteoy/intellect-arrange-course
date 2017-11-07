package com.class100.utils;

import com.class100.common.RequestCode;
import com.class100.model.HttpResponseInfo;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhoudazhuang on 17-11-7.
 */
public class HttpRequestClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(HttpRequestClient.class);


    /***
     * 发送请求
     * @param request 要发送的请求
     * @param charSet 响应的字符编码
     * @return HttpResponseInfo 封装响应的对象
     * */
    public static HttpResponseInfo sendRequest(HttpUriRequest request, String charSet) {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        try {
            httpClient = HttpClientUtils.getHttpClient();
            response = httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode == HttpStatus.SC_OK) {
                HttpEntity entity = response.getEntity();
                if (entity == null) {
                    return new HttpResponseInfo(false,statusCode,"http调用成功，但返回的主体内容为空");
                } else {
                    return new HttpResponseInfo(true,statusCode,"http调用成功", EntityUtils.toString(entity, charSet));
                }
            } else {
                return new HttpResponseInfo(false,statusCode,"http调用失败");
            }
        }catch(Exception e){
            LOGGER.error(e.getMessage(),e);
            LOGGER.error("monitorMsg{}", new StringBuffer("远程接口调用异常:").append(e.getMessage()), "");
            return new HttpResponseInfo(false, RequestCode.CALL_HTTP_EXECPTION,e.getMessage());
        }finally {
            try {
                //断开连接
                request.abort();
                if (response != null) {
                    EntityUtils.consume(response.getEntity());
                    response.close();
                }
            }catch(Exception e){
                LOGGER.error(e.getMessage(),e);
            }
        }
    }


}
