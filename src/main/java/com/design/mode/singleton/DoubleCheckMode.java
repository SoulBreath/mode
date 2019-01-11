package com.design.mode.singleton;

/**
 * 多线程的单例模式,使用双重校验机制
 */
public class DoubleCheckMode {

    // 私有静态引用
    private static volatile DoubleCheckMode doubleCheckMode;

    // 私有构造方法
    private DoubleCheckMode(){
        System.out.println("create "+getClass().getSimpleName());
    }

    // 公共访问获取实例的方法
    public static DoubleCheckMode getInstance(){
        // 第一重检查
        if (doubleCheckMode == null){
            synchronized (DoubleCheckMode.class){
                // 第二重检查
                if (doubleCheckMode == null){
                    doubleCheckMode = new DoubleCheckMode();
                }
            }
        }
        return doubleCheckMode;
    }
}
