package com.class100.utils;

import com.class100.model.HttpResultPoJo;
import com.class100.utils.httpclient.HttpClientHandle;
import org.apache.http.client.methods.HttpPost;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhoudazhuang on 17-11-7.
 */
public class sample {

    public static void main(String[] args) {
//        HttpPost post = new HttpPost("https://test-cms-api.class100.com/Oper/check_token");
        HttpPost post = new HttpPost("http://localhost:14500/Oper/check_token");
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("x-access-token","bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTAxMjYzNzI5MjQsImp0aSI6IjEiLCJpc3MiOiJjbGFzczEwMC5jb20ifQ.C6xDAq3mat1YCYGg5W91o4MKeWzzH_McD_CeAamCnD0");
        post.setHeader("Content-Type","application/json");
        post.setHeader("x-access-token","bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MTAxMjYzNzI5MjQsImp0aSI6IjEiLCJpc3MiOiJjbGFzczEwMC5jb20ifQ.C6xDAq3mat1YCYGg5W91o4MKeWzzH_McD_CeAamCnD0");
        HttpResultPoJo httpResultPoJo = HttpClientHandle.connect(HttpClientUtils.getHttpClient(), post);
        System.out.println(httpResultPoJo.toString());
    }
}
