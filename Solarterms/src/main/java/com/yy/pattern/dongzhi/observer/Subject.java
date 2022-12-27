package com.yy.pattern.dongzhi.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者也就是主题
 */
public abstract class Subject {

    //
    private List<Observer> observers;
    public Subject(){
        observers = new ArrayList<>();
    }

    public void register(Observer observer){
        this.observers.add(observer);
    }

    public void cancel(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObserver(int state){
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
