package com.design.mode.factory.methodFactory.product.imp;

import com.design.mode.factory.methodFactory.product.Animal;

/**
 * 狗
 */
public class Dog implements Animal {
    @Override
    public void introduce() {
        System.out.println("我养了一条狗, 它叫汪汪");
    }

    @Override
    public void eatFood() {
        System.out.println("狗喜欢吃骨头");
    }
}
