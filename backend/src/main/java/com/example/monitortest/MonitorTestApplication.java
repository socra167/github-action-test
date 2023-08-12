package com.example.monitortest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonitorTestApplication {

    public static void main(String[] args) {
        System.out.println("test line added!");
        System.out.println("test line2 added!");
        SpringApplication.run(MonitorTestApplication.class, args);
    }

}
