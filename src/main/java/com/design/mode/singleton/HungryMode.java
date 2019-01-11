package com.design.mode.singleton;

/**
 * 饿汉单例设计模式(加载类的时候就创建实例对象)
  */
public class HungryMode {

    // 私有的静态当前类实例对象
    private static HungryMode hungryMode = new HungryMode();

    // 私有的构造方法
    private HungryMode(){
        System.out.println("create "+ getClass().getSimpleName());
    }

    // 公有的静态获取实例方法
    public static HungryMode getInstance(){
        return hungryMode;
    }

}
