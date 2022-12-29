package com.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MsCollegeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCollegeServerApplication.class, args);
	}

}
