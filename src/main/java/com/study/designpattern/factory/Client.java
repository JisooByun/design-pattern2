package com.study.designpattern.factory;

import java.util.Calendar;
import java.util.Locale;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship ship = new WhiteShipFactory().orderShip();

        Calendar.getInstance(Locale.forLanguageTag("dsf"));

    }
}
