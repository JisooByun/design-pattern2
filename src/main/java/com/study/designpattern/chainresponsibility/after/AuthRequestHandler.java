package com.study.designpattern.chainresponsibility.after;

import com.study.designpattern.chainresponsibility.before.Request;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        //여기서 if문으로 체인은 종료해버릴수도있다. 만약 인증에 실패할경우 super.handle를 호출안하면 된다.
        System.out.println("인증");
        super.handle(request);
        //chain 거친후에 처리할것을 넣어도 된다.
    }
}
