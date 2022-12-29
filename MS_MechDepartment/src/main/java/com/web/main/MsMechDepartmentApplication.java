package com.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MsMechDepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMechDepartmentApplication.class, args);
	}

}
