package com.design.mode.factory.simpleFactory.test;

import com.design.mode.factory.simpleFactory.product.Animal;
import com.design.mode.factory.simpleFactory.factory.AnimalFactory;

public class SimpleFactoryTest {

    public static void main(String[] args){
        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.getAnimal("dog");
        dog.introduce();
        dog.eatFood();

        Animal cat = factory.getAnimal("cat");
        cat.introduce();
        cat.eatFood();
    }
}
