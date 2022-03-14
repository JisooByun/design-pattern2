package com.study.designpattern.decorator.before;

public class App {
    public static void main(String[] args) {

        Client client = new Client(new SpamCommentService());
        Client client1 = new Client(new TrimCommentService());//만약 Spam과 Trim 둘다 하는것은 SpamTrim이라는 새로운 클래스를 또 만들어야함,

        client.writeComment("sdjfkjsdl");


    }

}
