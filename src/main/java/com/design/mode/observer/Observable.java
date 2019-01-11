package com.design.mode.observer;

/**
 * 被观察者接口
 * 声明了添加,删除,通知观察者方法
 */
public interface Observable {
    public void register(Observer o);
    public void remove(Observer o);
    public void notifys();
}
