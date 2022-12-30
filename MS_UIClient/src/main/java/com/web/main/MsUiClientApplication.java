package com.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class MsUiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsUiClientApplication.class, args);
	}

}
