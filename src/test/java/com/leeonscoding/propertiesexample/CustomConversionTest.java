package com.leeonscoding.propertiesexample;

import com.leeonscoding.propertiesexample.beans.FruitBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomConversionTest {

    @Autowired
    private FruitBean fruit;

    @Test
    public void getCustomObject() {
        Assertions.assertEquals("mango", fruit.getFruit().getName());
        Assertions.assertEquals(200, fruit.getFruit().getPrice());
    }

}
