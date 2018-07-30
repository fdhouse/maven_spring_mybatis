package com.example.demo.pojo;

import java.util.List;

public class ReturnApi {
    private Integer code = 200;
    private String message = "操作成功";
    private List data;

    public ReturnApi(List data, Integer code, String message) {
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
    }

    public ReturnApi(List data, Integer code) {
        this.setCode(code);
        this.setData(data);
    }

    public ReturnApi(List data, String message) {
        this.setMessage(message);
        this.setData(data);
    }

    public ReturnApi(List data) {
        this.setData(data);
    }

    public Integer getCode() { return this.code; }
    public void setCode(Integer code){ this.code = code; }

    public String getMessage() { return this.message; }
    public void setMessage(String message) { this.message = message; }

    public List getData() { return this.data; }
    public void setData(List data) { this.data = data; }
}
