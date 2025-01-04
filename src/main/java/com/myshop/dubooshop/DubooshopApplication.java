package com.myshop.dubooshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DubooshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubooshopApplication.class, args);
	}

}
