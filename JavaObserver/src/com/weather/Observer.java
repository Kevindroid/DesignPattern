package com.weather;

/**
 * 这是一个观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 * Created by Kevin on 2016/11/7.
 */
public interface Observer {

    //观察者更新的接口,subject传入目标对象，方便获取相应的目标状态
    public void update(WeatherSubject subject);
}
