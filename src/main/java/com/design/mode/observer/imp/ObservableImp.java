package com.design.mode.observer.imp;

import com.design.mode.observer.Observable;
import com.design.mode.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者实现类
 */
public class ObservableImp implements Observable {

    // 用来存储注册了的观察者
    private List<Observer> list;
    // 被观察者发布的消息
    private String message;

    // 无参构造函数,在初始化时就实例化一个ArrayList来存储注册的观察者
    public ObservableImp(){
        list = new ArrayList<>();
    }

    // 注册观察者
    @Override
    public void register(Observer o) {
        list.add(o);
    }

    // 删除观察者
    @Override
    public void remove(Observer o) {
        if (!list.isEmpty()){
            list.remove(o);
        }
    }

    // 通知观察者
    @Override
    public void notifys() {
        for (Observer o : list){
            o.update(message);
        }
    }

    // (消息更新)被观察者状态变化
    public void setInfo(String s){
        this.message = s;
        System.out.println("消息更新: "+ s);
        // 消息更新,通知所有观察者
        notifys();
    }
}
