package com.design.mode.singleton;

/**
 * 静态内部类的方式实现单例,可以保证多线程的对象唯一性,还有提升性能,不用同步锁机制
 */
public class InnerStaticMode {

    private InnerStaticMode(){

    }

    private static class SingletonHolder{
        static InnerStaticMode innerStaticMode = new InnerStaticMode();
    }

    public static InnerStaticMode getInstance(){
        return SingletonHolder.innerStaticMode;
    }
}
