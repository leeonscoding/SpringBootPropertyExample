package com.leeonscoding.propertiesexample;

import com.leeonscoding.propertiesexample.beans.Motorcycle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MotorcyclePropertyTest {

    @Autowired
    private Motorcycle motorcycle;

    @Test
    public void getMotorcycleBrandFromProperty2() {
        assertEquals("honda", motorcycle.getName());
    }
}
