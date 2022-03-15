package com.study.designpattern.command.after;

import com.study.designpattern.command.before.Light;

public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

    public static void main(String[] args) {

        Button button = new Button(new LightOnCommand(new Light()));
        button.press();

    }

}
