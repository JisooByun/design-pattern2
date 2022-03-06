package com.study.designpattern.composit;

public class App {


    public static void main(String[] args) {
        Item doran = new Item("도란검", 450);
        Item water = new Item("물약", 50);

        Bag bag = new Bag();
        bag.add(doran);
        bag.add(water);
        //클라이언트는 구체적인것을 알지 못해도 됨, Components
        //bag이든 item이든 전체든 일부든 클라이언트 입장에서 동일한 메소드 호출함, 이는 Component라는 인터페이스를 두고 전체도 이것을 구현하고 일부도 이것을 구현하였기 때문에 가능
        printPrice(bag);
        printPrice(doran);

    }

    private static void printPrice(Component component) {
        System.out.println(component.getPrice());
    }

}
