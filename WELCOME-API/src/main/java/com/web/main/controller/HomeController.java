package com.web.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.FeignClient.GreetApiClient;

@RestController
public class HomeController
{

	private Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private GreetApiClient greetClient;

	@GetMapping(value = "/welcome")
	public String welcomeMsg() {

		logger.info("welcomeMsg() execution - start");

		String welcomeMsg = "Welcome API..!!";

		String greetMsg = greetClient.invokeGreetApi();

		logger.info("welcomeMsg() execution - end ");

		return greetMsg + ", " + welcomeMsg;
	}
}
