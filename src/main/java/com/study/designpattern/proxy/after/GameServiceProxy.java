package com.study.designpattern.proxy.after;


public class GameServiceProxy implements GameService {

    private GameService gameService;

    @Override
    public void startGame() {

        //여기서 아래와 같이 lazy-loading을 할 수도 있음
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }

        //보안 적용도 가능함.

        long start = System.currentTimeMillis();
        this.gameService.startGame();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
