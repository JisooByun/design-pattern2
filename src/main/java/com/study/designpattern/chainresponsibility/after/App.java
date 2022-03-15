package com.study.designpattern.chainresponsibility.after;

public class App {

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        //클라이언트 입장에선 chain으로 넘겨받은것을 실행시키기 때문에 클라이언트 코드는 변경할것이 없음.
        Client client = new Client(chain);
        client.doWork();


        //
    }
}
