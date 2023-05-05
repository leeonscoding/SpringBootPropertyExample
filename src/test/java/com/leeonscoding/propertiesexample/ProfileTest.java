package com.leeonscoding.propertiesexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProfileTest {

    @Autowired
    private ProfileData profileData;

    @Test
    public void getProfileData() {
        assertEquals("h2", profileData.getDriver());
    }
}
