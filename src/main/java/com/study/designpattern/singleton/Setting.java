package com.study.designpattern.singleton;


/**
 * 멀티스레드 환경에서는 아래와 같은 방식은 안전하지 않음
 *
 */
public class Setting {

    private static Setting setting = null;

    private Setting(){}

    public static Setting getInstance(){
        if(setting == null){
            setting = new Setting();// 두개의 스레드가 여기에 동시 접근이 가능함,그래서 서로 다른 객체를 가질수 있음
        }
        return setting;
    }


}
