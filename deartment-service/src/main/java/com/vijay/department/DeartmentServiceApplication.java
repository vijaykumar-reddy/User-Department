package com.vijay.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeartmentServiceApplication.class, args);
	}

}
