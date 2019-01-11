package com.design.mode.observer.imp;

import com.design.mode.observer.Observer;

/**
 * 观察者
 * 实现了update方法
 */
public class ObserverImp implements Observer {

    private String name;
    private String message;

    public ObserverImp(String name){
        this.name = name;
    }

    // 更新消息
    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    // 读取消息
    public void read(){
        System.out.println(name + " 收到推送消息: " + message);
    }
}
