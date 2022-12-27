package com.yy.pattern.dongzhi.observer;

public class ConcertSubject extends Subject{
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObserver(state);
    }
}
