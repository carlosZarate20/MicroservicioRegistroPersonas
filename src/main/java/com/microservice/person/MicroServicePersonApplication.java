package com.microservice.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.microservice.person" })
public class MicroServicePersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicePersonApplication.class, args);
	}
}
