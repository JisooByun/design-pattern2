package com.study.designpattern.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        SettingInMultiThread3 instance = SettingInMultiThread3.getInstance();

        //1. 리플렉션을 사용하여 싱글톤을 깰 수 있음, 방어 불가 방어하려면 enum으로 하면 reflection 막아둬서 불가능함, 또한 enum도 직렬화 역직렬화시에 같은 객체인것을 보장함,enum의 단점은 상속을쓰지 못하고 로딩시부터 생성되어있음,
        Constructor<SettingInMultiThread3> constructor = SettingInMultiThread3.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SettingInMultiThread3 settingInMultiThread3 = constructor.newInstance();

        //2. 직렬화 역직렬화를 통해 가능함, 직열화를 위해선 implements Serializable 이여야함, 안그럼 NotSerializableException 발생,
        //대응책 : readResolve() 메소드를 구현하여 방어 가능
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

        //자바에서 싱글톤
        Runtime runtime = Runtime.getRuntime(); //실행환경에 대한 정보를 얻을 수 있음
        System.out.println("runtime.maxMemory() = " + runtime.maxMemory());
        System.out.println("runtime.freeMemory() = " + runtime.freeMemory());

        //스프링에서 싱글톤
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String hello = context.getBean("hello", String.class);
        String hello1 = context.getBean("hello", String.class);
        System.out.println(hello == hello1);
    }
}
