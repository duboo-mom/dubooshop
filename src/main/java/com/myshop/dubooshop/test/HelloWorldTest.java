package com.myshop.dubooshop.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class HelloWorldTest {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldTest.class, args);
    }

    @GetMapping(value = "/")
    public String HelloWorld() {
        return "Hello World!";
    }


}
