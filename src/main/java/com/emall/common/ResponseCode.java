package com.emall.common;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/28 0028.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ResponseCode<T> implements Serializable{
    private int status;
    private String msg;
    private T data;

    @Override
    public String toString() {
        return "ResponseCode{" +
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

    public ResponseCode() {

    }

    public ResponseCode(int status, String msg, T data) {

        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ResponseCode(int status, T data) {
        this.status = status;
        this.data = data;
    }
}

