package com.yy.pattern.chunfen.singleton;

/**
 * @author yy
 * @version 1.0.0
 * @Description TODO 单例模式饿汉式
 * @createTime 2022-07-27 11:51:00
 */
public class Singleton3 {

    private static class SingletonHolder{
        private static final Singleton3 singleton = new Singleton3();
    }

    private Singleton3() {
    }

    public static Singleton3 getInstance(){
        return SingletonHolder.singleton;
    }
}
