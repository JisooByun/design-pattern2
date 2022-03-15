package com.study.designpattern.chainresponsibility.after;

import com.study.designpattern.chainresponsibility.before.Request;

public abstract class RequestHandler {
    private RequestHandler nextHandler;

    public RequestHandler(RequestHandler requestHandler) {
        this.nextHandler = requestHandler;
    }

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }

}
