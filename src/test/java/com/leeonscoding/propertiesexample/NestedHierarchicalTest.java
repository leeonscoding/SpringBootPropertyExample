package com.leeonscoding.propertiesexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class NestedHierarchicalTest {
    @Autowired
    private Data data;

    @Test
    public void listValidation() {
        List<String> testList = List.of("custom data 1", "custom data 2");

        assertEquals(testList, data.getTest());
    }

    @Test
    public void mapValidation() {
        Map<String, String> testMap = Map.ofEntries(
                Map.entry("host", "fake redis host"),
                Map.entry("connect-timeout", "100")
        );

        assertEquals(testMap, data.getRedis());
    }

    @Test
    public void objectValidation() {
        MongoDB m = new MongoDB();
        m.setHost("fake mongo host");
        m.setPort("fake mongo port");

        assertEquals(m.getHost(), data.getMongoDB().getHost());
        assertEquals(m.getPort(), data.getMongoDB().getPort());
    }
}
