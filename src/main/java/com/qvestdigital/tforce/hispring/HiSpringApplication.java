package com.qvestdigital.tforce.hispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// short for @Configuration @EnableAutoConfiguration @ComponentScan
@SpringBootApplication
public class HiSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(HiSpringApplication.class, args);
    }
}
