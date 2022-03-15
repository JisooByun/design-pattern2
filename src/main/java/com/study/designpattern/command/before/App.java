package com.study.designpattern.command.before;


public class App {
    private Game game;

    public App(Game game) {
        this.game = game;
    }

    public void press() {
        game.on();
    }

    public static void main(String[] args) {
        App app = new App(new Game());
        app.press();
        app.press();
        app.press();
        app.press();
    }

}
