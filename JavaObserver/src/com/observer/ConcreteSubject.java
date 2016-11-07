package com.observer;

/**
 * 具体目标对象，负责把有关状态存入到相应的观察者对象中
 * Created by luyun on 2016/11/7.
 */
public class ConcreteSubject extends Subject{

    //目标对象的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
