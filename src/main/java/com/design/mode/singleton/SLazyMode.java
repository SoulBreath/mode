package com.design.mode.singleton;

/**
 * 多线程下的单例模式(在多线程的情况下保持单例)
  */
public class SLazyMode {

    /**
     * 在获取类实例的方法上加同步锁，
     * 并且给类实例对象加上volatile修饰符，
     * volatile能保证对象的可见性，
     * 即在工作内存的内容更新能立即在主内存中可见。
     * 工作内存是线程独有的内存，
     * 主内存是所有线程共享的内存。
     * 还有一个作用是禁止指令重排序优化。
     * 大家知道我们写的代码（尤其是多线程代码），
     * 由于编译器优化，在实际执行的时候可能与我们编写的顺序不同。
     * 编译器只保证程序执行结果与源代码相同，
     * 却不保证实际指令的顺序与源代码相同。
     * 这在单线程看起来没什么问题，
     * 然而一旦引入多线程，
     * 这种乱序就可能导致严重问题。
     * volatile关键字就可以从语义上解决这个问题
     */ // 私有静态引用(使用volatile关键字保证对象可见性(强制主存读取),禁止指令重排，保证有序性)
    private static volatile SLazyMode sLazyMode;

    // 私有构造方法
    private SLazyMode(){
        System.out.println("create "+ getClass().getSimpleName());
    }

    // 公有获取实例的静态方法
    public static SLazyMode getInstance(){
        // 代码块加锁,不管哪一个线程运行到这个代码块时都要检查有没有其它线程正在运行这段代码.
        // 如果有,就要等这段代码被其它线程运行完了当前线程再来运行这段代码
        synchronized (SLazyMode.class){
            if (sLazyMode == null){
                sLazyMode = new SLazyMode();
            }
        }
        return sLazyMode;
    }
}
