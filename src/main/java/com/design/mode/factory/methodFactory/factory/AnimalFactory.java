package com.design.mode.factory.methodFactory.factory;

import com.design.mode.factory.methodFactory.product.Animal;

/**
 * 抽象工厂类
 */
public interface AnimalFactory {
    /**
     * 获得具体产品对象
     */
    Animal getAnimal();
}
