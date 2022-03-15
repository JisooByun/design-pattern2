package com.study.designpattern.chainresponsibility.before;

public class Client {
    public static void main(String[] args) {
        Request request = new Request("무궁화");
        RequestHandler handler = new LogRequestHandler();
        handler.handle(request);
    }
}
