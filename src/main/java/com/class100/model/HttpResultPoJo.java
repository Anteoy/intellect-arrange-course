package com.class100.model;

/**
 * Created by zhoudazhuang on 17-11-7.
 */
public class HttpResultPoJo {
    private static final long serialVersionUID = 2355368892053458556L;

    //响应状态 0、成功 1、失败
    private int statusCode;

    //信息提示
    private String resmsg;

    //数据内容
    private String data;


    public HttpResultPoJo() {
    }

    public HttpResultPoJo(int statusCode, String resmsg, String data) {
        this.statusCode = statusCode;
        this.resmsg = resmsg;
        this.data = data;
    }

    public HttpResultPoJo(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getResmsg() {
        return resmsg;
    }

    public void setResmsg(String resmsg) {
        this.resmsg = resmsg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
