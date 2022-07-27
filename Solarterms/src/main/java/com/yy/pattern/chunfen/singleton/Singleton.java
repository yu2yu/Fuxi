package com.yy.pattern.chunfen.singleton;

/**
 * @author yy
 * @version 1.0.0
 * @Description TODO 单例模式饿汉式
 * @createTime 2022-07-27 11:51:00
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return singleton;
    }
}
