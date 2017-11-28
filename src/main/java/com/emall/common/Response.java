package com.emall.common;

/**
 * Created by Administrator on 2017/11/28 0028.
 */
public class Response<T> {
    private int status;
    private String msg;
    private T data;

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Response() {

    }

    public Response(int status, String msg, T data) {

        this.status = status;
        this.msg = msg;
        this.data = data;
    }
}

