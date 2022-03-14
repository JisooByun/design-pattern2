package com.study.designpattern.proxy.after;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameServiceProxy gameServiceProxy = new GameServiceProxy();
        gameServiceProxy.startGame();


        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{GameService.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                method.invoke(target,args);
                return null;
            }
        })

    }
}
