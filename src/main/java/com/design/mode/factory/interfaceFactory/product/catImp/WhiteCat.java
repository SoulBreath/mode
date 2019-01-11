package com.design.mode.factory.interfaceFactory.product.catImp;

import com.design.mode.factory.interfaceFactory.product.ICat;

public class WhiteCat implements ICat {

    /**
     * 空的构造方法
     */
    public WhiteCat(){
        introduce();
        eatFood();
    }

    @Override
    public void introduce() {
        System.out.println("我养了一只白猫,它叫白喵!");
    }

    @Override
    public void eatFood() {
        System.out.println("白喵爱吃鱼!");
    }
}
