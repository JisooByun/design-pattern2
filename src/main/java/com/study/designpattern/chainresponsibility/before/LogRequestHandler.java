package com.study.designpattern.chainresponsibility.before;

public class LogRequestHandler extends RequestHandler{

    @Override
    public void handle(Request request) {
        System.out.println("log");
        super.handle(request);
    }
}
