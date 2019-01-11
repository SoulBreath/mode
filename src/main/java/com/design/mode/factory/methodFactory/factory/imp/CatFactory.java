package com.design.mode.factory.methodFactory.factory.imp;

import com.design.mode.factory.methodFactory.factory.AnimalFactory;
import com.design.mode.factory.methodFactory.product.Animal;
import com.design.mode.factory.methodFactory.product.imp.Cat;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal getAnimal() {
        return new Cat();
    }
}
