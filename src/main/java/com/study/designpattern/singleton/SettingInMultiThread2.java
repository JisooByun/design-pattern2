package com.study.designpattern.singleton;

public class SettingInMultiThread2 {
    private static volatile SettingInMultiThread2 setting = null; //

    private SettingInMultiThread2(){}

    public static SettingInMultiThread2 getInstance(){// double checked locking으로 효율적인 동기화 블럭 만들 수 잇음.
        if(setting == null){ // 생성된 이후에는 멀티 쓰레드로 접근되어도 synchronized가 안걸려있는 상태로 동작하게되어 빠름,메소드에 붙어있으면 생성된 이후에도 단일 스레드만 접근 가능해서 느림 이것을 보완함,
            synchronized (Setting.class){// 만약 생성되어있지 않은상태에서 두가지 스레드가 동시에 들어올 수도 있어서 synchronized블럭 사용
                if (setting == null){
                    setting = new SettingInMultiThread2();
                }
            }
        }
        return setting;
    }


}
