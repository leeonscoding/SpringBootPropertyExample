package com.leeonscoding.propertiesexample;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

@Component
@ConfigurationProperties(prefix = "file")
public class ConversionBean {
    private DataSize size1;

    @DataSizeUnit(DataUnit.MEGABYTES)
    private DataSize size2;

    public DataSize getSize1() {
        return size1;
    }

    public void setSize1(DataSize size1) {
        this.size1 = size1;
    }

    public DataSize getSize2() {
        return size2;
    }

    public void setSize2(DataSize size2) {
        this.size2 = size2;
    }
}
