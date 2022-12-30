package com.cjc.web.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.web.crud.model.Student;
import com.cjc.web.crud.service.HomeService;

@Controller
public class HomeController 
{
	@Autowired
	HomeService hs;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping("/reg")
	public String register()
	{
		return "register";
	}
	
	@RequestMapping("/gotologin")
	public String save(@ModelAttribute Student s)
	{
		hs.save(s);
		return "login";
	}
	
	@RequestMapping("/log")
	public String login(@RequestParam("mail") String ml,@RequestParam("pass") String ps,ModelMap m)
	{
		hs.login(ml,ps);
		List<Student> l=hs.display();
		m.addAttribute("data", l);
		return "success";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("roll") int r,ModelMap m)
	{
		hs.delete(r);
		List<Student> l=hs.display();
		m.addAttribute("data", l);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam("roll") int r,ModelMap m)
	{
		Student s=hs.getSingle(r);
		m.addAttribute("data", s);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute Student s,ModelMap m)
	{
		hs.update(s);
		List<Student> l=hs.display();
		m.addAttribute("data", l);
		return "success";
	}
}
