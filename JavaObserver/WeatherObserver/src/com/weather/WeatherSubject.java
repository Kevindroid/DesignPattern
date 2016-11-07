package com.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道它的观察者，并提供注册（添加）和删除它们的接口
 * Created by Kevin on 2016/11/7.
 */
public class WeatherSubject {
    //用来保存注册的观察者对象
    private List<Observer> observers=new ArrayList<>();

    //添加订阅天气的人
    public void attach(Observer observer){
        observers.add(observer);
    }

    //删除集合中指定的订阅天气的人
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //通知所有已订阅天气的人
    protected void notifyObservers(){
        for (Observer observer:observers) {
            observer.update(this);
        }
    }
}
