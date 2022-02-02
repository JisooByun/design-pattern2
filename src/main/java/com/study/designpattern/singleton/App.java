package com.study.designpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        SettingInMultiThread3 instance = SettingInMultiThread3.getInstance();

        //1. 리플렉션을 사용하여 싱글톤을 깰 수 있음,
        Constructor<SettingInMultiThread3> constructor = SettingInMultiThread3.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SettingInMultiThread3 settingInMultiThread3 = constructor.newInstance();

        //2. 직렬화 역직렬화를 통해 가능함, 직열화를 위해선 implements Serializable 이여야함, 안그럼 NotSerializableException 발생,
        //직렬화
        try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            output.writeObject(instance);
        }
        SettingInMultiThread3 instance1;
        //역직렬화
        try( ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            instance1 = (SettingInMultiThread3) in.readObject();//역직열화해서 객체를 생성하면 새로운 객체로 생성됨,
        }

        System.out.println(instance == settingInMultiThread3);
        System.out.println(instance == instance1);
    }
}
