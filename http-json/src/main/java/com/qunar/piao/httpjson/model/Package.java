package com.qunar.piao.httpjson.model;

import java.util.Map;

/**
 * Created by zhaoxin on 16-8-1.
 */
public class Package {

    private String message=null;

    private Data data;

    private int status=0;

    private int ver=1;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getVer() {
        return ver;
    }

    public void setVer(int ver) {
        this.ver = ver;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(Data data) {
        this.data = data;
    }


    public String getMessage() {
        return message;
    }

    public Data getData() {
        return data;
    }



}
