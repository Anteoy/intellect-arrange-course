package com.class100.model;

/**
 * Created by zhoudazhuang on 17-11-7.
 */
public class HttpResponseInfo {
    private static final long serialVersionUID = -336700316694035246L;

    private boolean isSuccess;//用于标示http请求是否成功，如果httpstatus == 200,则isSuccess为true，否则false

    private Integer code;//http请求返回的状态码，如果code == -1 标示接口调用出现异常

    private String msg;//状态码描述符

    private String data;//http接口调用返回的实际内容

    public HttpResponseInfo(boolean isSuccess, Integer code, String msg) {
        super();
        this.isSuccess = isSuccess;
        this.code = code;
        this.msg = msg;
    }

    public HttpResponseInfo(boolean isSuccess, Integer code, String msg, String data) {
        super();
        this.isSuccess = isSuccess;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
