package com.leeonscoding.propertiesexample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@TestPropertySource("/custom-property1.properties")
public class InjectPropertyTest {

    @Value("${motorcycle.brand}")
    private String name;

    @Test
    public void nameTest() {
        assertEquals("yamaha", name);
    }
}
