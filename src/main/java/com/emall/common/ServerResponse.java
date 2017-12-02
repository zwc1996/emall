package com.emall.common;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * Created by zwc on 2017/11/29.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ServerResponse<T> implements Serializable{

    private int status;
    private String msg;
    private T data;

    private ServerResponse(int status){
        this.status = status;
    }

    private ServerResponse(int status,String msg){
        this.status = status;
        this.msg = msg;
    }

    private ServerResponse(int status,T data){
        this.status = status;
        this.data = data;
    }

    private ServerResponse(int status,String msg,T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    @JsonIgnore
    public boolean isSuccess(){
        return this.status == ResponseCode.SUCCESS.getCode();
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public static<T> ServerResponse<T> createSuccessResponse(){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    public static<T> ServerResponse<T> createSuccessResponse(T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    public static<T> ServerResponse<T> createSuccessResponse(String msg, T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }

    public static<T> ServerResponse<T> createSuccessMessageResponse(String msg){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg);
    }

    public static<T> ServerResponse<T> createErrorResponse(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode());
    }

    public static<T> ServerResponse<T> createErrorResponse(T data){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),data);
    }

    public static<T> ServerResponse<T> createErrorResponse(String msg, T data){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),msg,data);
    }

    public static<T> ServerResponse<T> createErrorMessageResponse(String msg){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),msg);
    }

    public static<T> ServerResponse<T> createErrorCodeMsg(int errCode,String errMsg){
        return new ServerResponse<T>(errCode,errMsg);
    }


}
