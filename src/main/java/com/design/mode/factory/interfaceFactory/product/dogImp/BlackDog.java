package com.design.mode.factory.interfaceFactory.product.dogImp;

import com.design.mode.factory.interfaceFactory.product.IDog;

public class BlackDog implements IDog {

    /**
     * 空的构造方法
     */
    public BlackDog(){
        introduce();
        eatFood();
    }

    @Override
    public void introduce() {
        System.out.println("我养了一条黑狗,它叫小黑!");
    }

    @Override
    public void eatFood() {
        System.out.println("小黑爱吃骨头!");
    }
}
