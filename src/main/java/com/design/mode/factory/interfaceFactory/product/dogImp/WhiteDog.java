package com.design.mode.factory.interfaceFactory.product.dogImp;

import com.design.mode.factory.interfaceFactory.product.IDog;

public class WhiteDog implements IDog {

    /**
     * 空的构造方法
     */
    public WhiteDog(){
        introduce();
        eatFood();
    }

    @Override
    public void introduce() {
        System.out.println("我养了一条白狗,它叫小白!");
    }

    @Override
    public void eatFood() {
        System.out.println("小白爱吃骨头!");
    }
}
