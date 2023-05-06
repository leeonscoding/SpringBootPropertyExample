package com.leeonscoding.propertiesexample;

import com.leeonscoding.propertiesexample.beans.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CarPropertyTest {

    @Autowired
    private Car car;

    @Test
    public void getCarBrandFromProperty4() {
        assertEquals("ford", car.getName());
    }
}
