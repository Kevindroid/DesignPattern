package test;

import com.weather.ConcreteObserver;
import com.weather.ConcreteWeatherSubject;

/**
 * Created by luyun on 2016/11/7.
 */
public class Client {
    public static void main(String[] args){
        //1、创建目标
        ConcreteWeatherSubject weatherSubject=new ConcreteWeatherSubject();

        //2、创建观察者
        ConcreteObserver observerGirl=new ConcreteObserver();
        observerGirl.setObserverName("女票");
        observerGirl.setRemindThing("出去约会");

        ConcreteObserver observerMom=new ConcreteObserver();
        observerMom.setObserverName("老妈");
        observerMom.setRemindThing("广场舞走起！");

        //3、注册观察者
        weatherSubject.attach(observerGirl);
        weatherSubject.attach(observerMom);

        //4、目标发布天气，自动更新所有的观察者
        weatherSubject.setWeatherContent("天气晴朗！");
    }
}
