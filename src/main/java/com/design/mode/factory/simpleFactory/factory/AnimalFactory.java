package com.design.mode.factory.simpleFactory.factory;

import com.design.mode.factory.simpleFactory.product.Animal;
import com.design.mode.factory.simpleFactory.product.imp.Cat;
import com.design.mode.factory.simpleFactory.product.imp.Dog;

/**
 * 动物工厂类,专门用于创建类Dog和Cat的对象,通过一个参数来获取需要的对象来实现功能
 */
public class AnimalFactory {
    /**
     * 获得宠物的对象
     * @param
     */
    public Animal getAnimal(String animal){
        if (animal.equals("dog")){
            return new Dog();
        }else if (animal.equals("cat")){
            return new Cat();
        }
        return null;
    }
}
