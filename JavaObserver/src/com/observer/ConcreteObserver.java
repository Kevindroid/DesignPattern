package com.observer;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态一致
 * Created by luyun on 2016/11/7.
 */
public class ConcreteObserver implements Observer {

    //观察者状态
    private String observerState;

    /**
     * 目标类的状态同步到观察者中
     * @param subject
     */
    @Override
    public void update(Subject subject) {
        observerState=((ConcreteSubject)subject).getSubjectState();
    }
}
