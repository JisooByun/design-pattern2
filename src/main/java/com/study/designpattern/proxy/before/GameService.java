package com.study.designpattern.proxy.before;

public class GameService {
    public void startGame() throws InterruptedException {
        System.out.println("게임에 접속합니다.");
        Thread.sleep(3);
    }

}
