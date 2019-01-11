package com.design.mode.singleton;

/**
 * 懒汉单例设计模式(只有获取实例的时候才创建对象)
  */
public class LazyMode {

    // 声明私有静态的本类引用变量
    private static LazyMode lazyMode;

    // 私有的构造方法
    private LazyMode(){
        System.out.println("create "+getClass().getSimpleName());
    }

    // 公共的静态获取实例的方法
    public static LazyMode getInstance() {
        if (lazyMode == null){
            lazyMode = new LazyMode();
        }
        return lazyMode;
    }
}
