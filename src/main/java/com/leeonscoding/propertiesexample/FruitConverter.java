package com.leeonscoding.propertiesexample;

import com.leeonscoding.propertiesexample.beans.Fruit;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class FruitConverter implements Converter<String, Fruit> {
    @Override
    public Fruit convert(String value) {
        String[] values = value.split(",");

        return new Fruit(values[0], Integer.parseInt(values[1]));
    }

}
