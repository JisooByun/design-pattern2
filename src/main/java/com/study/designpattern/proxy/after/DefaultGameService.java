package com.study.designpattern.proxy.after;

public class DefaultGameService implements GameService {

    @Override
    public void startGame() {
        System.out.println("게임에 접속합니다2");
    }
}
