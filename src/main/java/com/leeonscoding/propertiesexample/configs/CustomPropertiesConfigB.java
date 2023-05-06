package com.leeonscoding.propertiesexample.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:custom-property4.properties")
public class CustomPropertiesConfigB {
}
