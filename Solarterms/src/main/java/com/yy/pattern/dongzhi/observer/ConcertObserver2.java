package com.yy.pattern.dongzhi.observer;

public class ConcertObserver2 implements Observer{

    private String name;

    public ConcertObserver2(String name) {
        this.name = name;
    }

    @Override
    public void update(int state){
        System.out.println(name+ "receive subject state change:"+state);
        // doSomething
    }
}
