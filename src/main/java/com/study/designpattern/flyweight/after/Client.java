package com.study.designpattern.flyweight.after;


public class Client {


    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "white", fontFactory.getFont("Nanum:12"));
        new Character('e', "white", fontFactory.getFont("Nanum:12"));
        new Character('l', "white", fontFactory.getFont("Nanum:12"));

        //Integer.valueOf는 내부적으로 캐싱함, doc에 잘 나와있음
        Integer i1 = Integer.valueOf(1200);
        Integer i2 = Integer.valueOf(1200);
        System.out.println(i1 == i2);
    }

}
