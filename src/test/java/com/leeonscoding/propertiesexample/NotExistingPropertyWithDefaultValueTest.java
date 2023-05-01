package com.leeonscoding.propertiesexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class NotExistingPropertyWithDefaultValueTest {
    @Autowired
    private Ship ship;

    @Test
    public void getDefaultProperty() {
        assertEquals("this is a default value", ship.getName());
    }
}
