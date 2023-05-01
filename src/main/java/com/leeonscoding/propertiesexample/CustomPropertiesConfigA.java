package com.leeonscoding.propertiesexample;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:custom-property3.properties")
public class CustomPropertiesConfigA {
}
