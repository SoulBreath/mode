package com.design.mode.factory.interfaceFactory.product.catImp;

import com.design.mode.factory.interfaceFactory.product.ICat;

public class BlackCat implements ICat {

    /**
     * 空的构造方法
     */
    public BlackCat(){
        introduce();
        eatFood();
    }

    @Override
    public void introduce() {
        System.out.println("我养了一只黑猫,它叫黑喵!");
    }

    @Override
    public void eatFood() {
        System.out.println("黑喵爱吃鱼!");
    }
}
