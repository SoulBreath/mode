package com.design.mode.observer.test;

import com.design.mode.observer.Observer;
import com.design.mode.observer.imp.ObservableImp;
import com.design.mode.observer.imp.ObserverImp;

public class ObserverTest {


    public static void main(String[] args){
        // 创建被观察者
        ObservableImp observable = new ObservableImp();

        // 创建三个观察者
        Observer zhang = new ObserverImp("张三");
        Observer li = new ObserverImp("李四");
        Observer wang = new ObserverImp("王五");

        // 注册观察者
        observable.register(zhang);
        observable.register(li);
        observable.register(wang);

        // 更新消息
        observable.setInfo("PHP是世界上最好的语言!");

        // 分割线
        System.out.println("----------------------------------------");

        // 张三取消订阅
        observable.remove(zhang);

        // 再次更新消息
        observable.setInfo("Java是世界上最好的语言!");
    }

}
