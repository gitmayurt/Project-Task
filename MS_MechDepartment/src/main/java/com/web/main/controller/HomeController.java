package com.web.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.model.Mechanical;

@RestController
public class HomeController
{
	@RequestMapping("/getPro")
	public Mechanical details()
	{
		Mechanical m= new Mechanical();
		m.setId(101);
		m.setName("Mech");
		return m;
	}
}
