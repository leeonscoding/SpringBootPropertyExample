package com.leeonscoding.propertiesexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ConversionBeanTest {
    @Autowired
    private ConversionBean cb;

    @Test
    public void KBValidation() {
        DataSize d = DataSize.of(2, DataUnit.KILOBYTES);
        assertEquals(d, cb.getSize1());
    }

    @Test
    public void MBValidation() {
        DataSize d = DataSize.of(2, DataUnit.MEGABYTES);
        assertEquals(d, cb.getSize2());
    }
}
