package com.yy.pattern.chunfen.singleton;

/**
 * @author yy
 * @version 1.0.0
 * @Description TODO 单例模式双重校验
 * @createTime 2022-07-27 11:51:00
 */
public class Singleton2 {

    private volatile static Singleton2 singleton;

    private Singleton2() {
    }

    public static Singleton2 getInstance(){
        if(singleton == null){
            synchronized (Singleton2.class) {
                if(singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}
