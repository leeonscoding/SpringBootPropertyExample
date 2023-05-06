package com.leeonscoding.propertiesexample.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//Multiple @PropertySource only supports in Java 1.8 or higher
//@PropertySource("classpath:custom-property1.properties")
//@PropertySource("classpath:custom-property2.properties")
@PropertySources({
        @PropertySource("classpath:custom-property1.properties"),
        @PropertySource("classpath:custom-property2.properties"),
        @PropertySource("classpath:hierarchical-example1.properties")
})
@ComponentScan(basePackages = "com.leeonscoding.propertiesexample")
public class CustomPropertiesConfig {
}
