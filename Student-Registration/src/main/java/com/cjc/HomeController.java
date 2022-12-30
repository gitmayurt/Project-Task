package com.cjc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String index()
	{
		return "login";
	}
	@RequestMapping("/log")
	public String login(@RequestParam("user") String us, @RequestParam("pass") String ps)
	{
		System.out.println("*****Login Page*****");
		System.out.println("UserName: "+us);
		System.out.println("Password: "+ps);
		return "success";
	}
	@RequestMapping("/reg")
	public String register()
	{
		return "register";
	}
	@RequestMapping("/gotologin")
	public String gotologin(@RequestParam("nm") String nm, @RequestParam("mail") String mail, @RequestParam("user") String us, @RequestParam("pass") String ps, @RequestParam("mob") String mb, @RequestParam("gender") String g, @RequestParam("course") String c)
	{
		System.out.println("*****Register Page*****");
		System.out.println("Name: "+nm);
		System.out.println("Mail: "+mail);
		System.out.println("UserName: "+us);
		System.out.println("Password: "+ps);
		System.out.println("Mobile No: "+mb);
		System.out.println("Gender: "+g);
		System.out.println("Course: "+c);
		return "login";
	}
}
