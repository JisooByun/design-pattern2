package com.study.designpattern.singleton;

import java.io.Serializable;

public class SettingInMultiThread3 implements Serializable {

    private SettingInMultiThread3() {
    }

    private static class InstanceHolder{
        private static final SettingInMultiThread3 INSTANCE = new SettingInMultiThread3(); // static 클래스가 로딩되는 시점에 생성됨.
    }

    public static SettingInMultiThread3 getInstance() {
        return InstanceHolder.INSTANCE; //static class에 접근하는 순간 클래스 로딩이 일어나면서 내부 멤버변수가 초기화된다. 따라서 multi-thread에 안전하면서 성능상에도 문제가 없다.
    }

    //역직렬화시에 해당 메소드가 실행됨, 따라서 getInstance 메소드를 호출하므로써 싱글톤 보장
    protected Object readResolve(){
        return getInstance();
    }


}
