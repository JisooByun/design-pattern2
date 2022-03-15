package com.study.designpattern.chainresponsibility.before;

public class AuthRequestHandler extends RequestHandler {
    @Override
    public void handle(Request request) {
        System.out.println("사용자 인증 시작");
        super.handle(request);
    }
}
