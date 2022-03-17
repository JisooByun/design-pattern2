package com.study.designpattern.mediator.after;

public class Guest {
    private FrontDesk frontDesk = new FrontDesk();

    public void getTowers(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }

    public int getId() {
        return 0;
    }
}
