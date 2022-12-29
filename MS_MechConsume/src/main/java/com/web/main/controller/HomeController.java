package com.web.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.web.main.model.Mechanical;

@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	RestTemplate rt;
	
	@RequestMapping("/getCon/{un}/{pass}")
	public Mechanical display(@PathVariable("un") String us,@PathVariable("pass") String ps)
	{
		System.out.println("Username is "+us+"& Password is "+ps);
		//Eureka->zuul->consume->produce
		//String url="http://localhost:9091/getPro";
		
		//Load Balancing
		//Eureka->zuul->consume->zuul->produce
		String url="http://zuul/mech/getPro";
		
		Mechanical m=rt.getForObject(url, Mechanical.class);
		return m;
	}
}
