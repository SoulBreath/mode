package com.design.mode.factory.interfaceFactory.test;

import com.design.mode.factory.interfaceFactory.factory.AnimalFactory;
import com.design.mode.factory.interfaceFactory.factory.imp.BlackAnimalFactory;
import com.design.mode.factory.interfaceFactory.factory.imp.WhiteAnimalFactory;
import org.junit.jupiter.api.Test;

public class IFTest {

    @Test
    public void testIF(){
        AnimalFactory baf = new BlackAnimalFactory();
        baf.keepDog();
        baf.keepCat();
        AnimalFactory waf = new WhiteAnimalFactory();
        waf.keepDog();
        waf.keepCat();
    }
}
