package com.web.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.model.Civil;

@RestController
public class HomeController {

	@RequestMapping("/getPro")
	public Civil details()
	{
		Civil c=new Civil();
		c.setId(201);
		c.setName("Civil");
		return c;
	}
}
