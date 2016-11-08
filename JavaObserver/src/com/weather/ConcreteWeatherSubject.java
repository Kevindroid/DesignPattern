package com.weather;

/**
 * 具体目标对象，负责把有关状态存入到相应的观察者对象中
 * Created by luyun on 2016/11/7.
 */
public class ConcreteWeatherSubject extends WeatherSubject {

    //获取天气信息
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        //通知所有的订阅者
        this.notifyObservers();
    }
}
