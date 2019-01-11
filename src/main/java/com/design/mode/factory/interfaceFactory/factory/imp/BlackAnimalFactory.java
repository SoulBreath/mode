package com.design.mode.factory.interfaceFactory.factory.imp;

import com.design.mode.factory.interfaceFactory.factory.AnimalFactory;
import com.design.mode.factory.interfaceFactory.product.ICat;
import com.design.mode.factory.interfaceFactory.product.IDog;
import com.design.mode.factory.interfaceFactory.product.catImp.BlackCat;
import com.design.mode.factory.interfaceFactory.product.dogImp.BlackDog;

/**
 * 黑色动物工厂类
 */
public class BlackAnimalFactory implements AnimalFactory {
    @Override
    public IDog keepDog() {
        return new BlackDog();
    }

    @Override
    public ICat keepCat() {
        return new BlackCat();
    }
}
