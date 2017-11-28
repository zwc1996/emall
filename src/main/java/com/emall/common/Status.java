package com.emall.common;

/**
 * Created by Administrator on 2017/11/28 0028.
 */
public enum Status {
    success(0,"success"),fail(1,"fail"),unlogin(3,"unlogin"),arguerror(4,"arguerror");
    private final int index;
    private final String sta;

    Status(int index, String sta) {
        this.index = index;
        this.sta = sta;
    }

    public int getIndex() {
        return index;
    }

    public String getSta() {
        return sta;
    }
}
