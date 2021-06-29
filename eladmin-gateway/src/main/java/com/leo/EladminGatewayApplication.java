package com.leo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Jjcc
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EladminGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EladminGatewayApplication.class, args);
    }

}
