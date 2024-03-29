package com.example.bootiful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BootifulApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootifulApplication.class, args);
    }

}
