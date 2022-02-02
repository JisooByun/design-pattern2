package com.study.designpattern.singleton;

public class SettingInMultiThread {
    private static SettingInMultiThread setting = null; // new SettingInMultiThread()를 통해서 클래스 로딩될때 만들어도됨 eager initialize라서 스레드 세이프함 하지만 미리 만들기 때문에 단점, 안쓰는데도 있게됨. 메소드로하면 호출시에만 생성됨

    private SettingInMultiThread(){}

    public static synchronized SettingInMultiThread getInstance(){//메소드 동기화를 통해 하나의 스레드만 접근이 가능함, 단 성능의 불이익이 있음,lock을 잡고 lock을 가진 스레드만 접근 가능하도록 다 접근하면 lock 해제
        if(setting == null){
            setting = new SettingInMultiThread();
        }
        return setting;
    }


}
