package com.design.mode.factory.interfaceFactory.factory.imp;

import com.design.mode.factory.interfaceFactory.factory.AnimalFactory;
import com.design.mode.factory.interfaceFactory.product.ICat;
import com.design.mode.factory.interfaceFactory.product.IDog;
import com.design.mode.factory.interfaceFactory.product.catImp.WhiteCat;
import com.design.mode.factory.interfaceFactory.product.dogImp.WhiteDog;

/**
 * 白色动物工厂类
 */
public class WhiteAnimalFactory implements AnimalFactory {

    @Override
    public IDog keepDog() {
        return new WhiteDog();
    }

    @Override
    public ICat keepCat() {
        return new WhiteCat();
    }
}
