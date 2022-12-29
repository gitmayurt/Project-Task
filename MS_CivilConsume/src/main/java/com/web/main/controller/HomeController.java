package com.web.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.web.main.model.Civil;

@RestController
public class HomeController {

	@Autowired
	RestTemplate rt;
	
	@RequestMapping("/getCon")
	public Civil display()
	{
		Civil c=rt.getForObject("http://localhost:9093/getPro", Civil.class);
		return c;
	}
}
