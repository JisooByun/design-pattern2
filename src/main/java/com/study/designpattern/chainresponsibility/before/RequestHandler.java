package com.study.designpattern.chainresponsibility.before;

public class RequestHandler {

    public void handle(Request request){
        System.out.println(request.getBody());
    }
}
