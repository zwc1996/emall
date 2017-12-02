package com.emall.common;

/**
 * Created by zwc on 2017/11/29.
 */
public enum ResponseCode {
    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT"),
    NEED_LOGIN(10,"NEED_LOGIN");

    private int code;
    private String descrption;

    ResponseCode(int code,String descrption) {
        this.code = code;
        this.descrption = descrption;
    }

    public int getCode() {
        return code;
    }

    public String getDescrption() {
        return descrption;
    }
}
