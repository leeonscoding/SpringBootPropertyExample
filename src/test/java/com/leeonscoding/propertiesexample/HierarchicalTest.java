package com.leeonscoding.propertiesexample;

import com.leeonscoding.propertiesexample.beans.Mail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HierarchicalTest {
    @Autowired
    private Mail mail;

    @Test
    public void mailPropertiesValidation() {
        assertEquals(3303, mail.getPort());
        assertEquals("192.168.11.102", mail.getHost());
        assertEquals("admin", mail.getUsername());
        assertEquals("root", mail.getPassword());
    }
}
