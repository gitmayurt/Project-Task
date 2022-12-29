package com.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableEurekaClient
@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class Multiplex2Application {

	public static void main(String[] args) {
		SpringApplication.run(Multiplex2Application.class, args);
	}

}
