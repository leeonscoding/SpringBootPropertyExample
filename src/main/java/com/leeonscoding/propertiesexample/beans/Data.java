package com.leeonscoding.propertiesexample.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Configuration
@Component
@PropertySource("classpath:hierarchical-example2.properties")
@ConfigurationProperties(prefix = "spring.data")
public class Data {
    //Object type
    private MongoDB mongodb;
    //Map type
    private Map<String, String> redis;
    //List type
    private List<String> test;

    public MongoDB getMongoDB() {
        return mongodb;
    }

    public void setMongoDB(MongoDB mongodb) {
        this.mongodb = mongodb;
    }

    public Map<String, String> getRedis() {
        return redis;
    }

    public void setRedis(Map<String, String> redis) {
        this.redis = redis;
    }

    public List<String> getTest() {
        return test;
    }

    public void setTest(List<String> test) {
        this.test = test;
    }

    public static class MongoDB {
        private String host;
        private String port;

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }
    }

}
