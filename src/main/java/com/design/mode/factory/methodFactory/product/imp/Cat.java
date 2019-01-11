package com.design.mode.factory.methodFactory.product.imp;

import com.design.mode.factory.methodFactory.product.Animal;

public class Cat implements Animal {
    @Override
    public void introduce() {
        System.out.println("我养了一只猫, 它叫喵喵");
    }

    @Override
    public void eatFood() {
        System.out.println("猫喜欢吃鱼!");
    }
}
