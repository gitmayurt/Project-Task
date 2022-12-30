package com.web.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{

	@RequestMapping(value = "/greet")
	public String view()
	{
		return "GREET API!!!";
	}
}
