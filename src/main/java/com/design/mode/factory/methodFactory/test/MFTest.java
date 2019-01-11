package com.design.mode.factory.methodFactory.test;

import com.design.mode.factory.methodFactory.product.imp.Cat;
import com.design.mode.factory.methodFactory.factory.imp.CatFactory;
import com.design.mode.factory.methodFactory.product.imp.Dog;
import com.design.mode.factory.methodFactory.factory.imp.DogFactory;
import org.junit.jupiter.api.Test;

public class MFTest {

    @Test
    public void testMF(){
        DogFactory dogFactory = new DogFactory();
        Dog dog = (Dog) dogFactory.getAnimal();
        dog.introduce();
        dog.eatFood();

        CatFactory catFactory = new CatFactory();
        Cat cat = (Cat) catFactory.getAnimal();
        cat.introduce();
        cat.eatFood();
    }
}
