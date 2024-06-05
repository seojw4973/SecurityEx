package com.example.springsecurityex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.springsecurityex.controller")   // 선택사항
public class SpringsecurityExApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityExApplication.class, args);
    }

}
