package com.study.designpattern.chainresponsibility.after;

import com.study.designpattern.chainresponsibility.before.Request;

public class PrintRequestHandler extends RequestHandler {

    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
