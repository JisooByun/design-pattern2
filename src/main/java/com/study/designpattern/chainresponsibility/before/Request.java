package com.study.designpattern.chainresponsibility.before;

public class Request {

    private String body;

    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}
