package com.leo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Jjcc
 */
@SpringBootApplication
//@ConfigurationProperties("name1.jjcc1")
public class EladminGatewayApplication {

    private String name;

    public static void main(String[] args) {
        SpringApplication.run(EladminGatewayApplication.class, args);
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
