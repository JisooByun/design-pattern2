package com.study.designpattern.chainresponsibility.after;

import com.study.designpattern.chainresponsibility.before.Request;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("요청");
        requestHandler.handle(request);

    }


}
