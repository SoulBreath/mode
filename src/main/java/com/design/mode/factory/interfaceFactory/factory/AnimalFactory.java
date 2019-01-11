package com.design.mode.factory.interfaceFactory.factory;

import com.design.mode.factory.interfaceFactory.product.ICat;
import com.design.mode.factory.interfaceFactory.product.IDog;

/**
 * 抽象工厂类
 */
public interface AnimalFactory {

    /**
     * 养狗
     */
    IDog keepDog();

    /**
     * 养猫
     */
    ICat keepCat();
}
