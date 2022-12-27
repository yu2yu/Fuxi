package com.yy.pattern.dongzhi.observer;

public class ConcertObserver1 implements Observer{

    private String name;

    public ConcertObserver1(String name) {
        this.name = name;
    }

    @Override
    public void update(int state){
        System.out.println(name+ "receive subject state change:"+state);
        // doSomething
    }
}
