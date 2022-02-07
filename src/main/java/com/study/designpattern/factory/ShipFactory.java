package com.study.designpattern.factory;

public interface ShipFactory {

    default Ship orderShip(){
        prepare();
        Ship ship = createShip();
        end();
        return ship;
    }

    private void prepare(){
        System.out.println("배가 준비중입니다.");
    }

    private void end(){
        System.out.println("배가 모두 준비되었습니다.");
    }
    Ship createShip();
}
