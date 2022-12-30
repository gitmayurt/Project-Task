package com.web.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.web.main.model.ShowDetails;

@CrossOrigin("*")
@RestController
public class HomeController 
{
	@Autowired
	RestTemplate rt;

	@RequestMapping(value = "/get/{name}/{date}",method = RequestMethod.GET)
	public List get(@PathVariable("name") String n,@PathVariable("date") String d)
	{
		List list=new ArrayList<>();
		Iterable<ShowDetails> l=rt.getForObject("http://zuul/m1/get"+"/"+n+"/"+d, Iterable.class);
		Iterable<ShowDetails> l1=rt.getForObject("http://zuul/m2/get"+"/"+n+"/"+d, Iterable.class);
		Iterable<ShowDetails> l2=rt.getForObject("http://zuul/m3/get"+"/"+n+"/"+d, Iterable.class);
		Iterable<ShowDetails> l3=rt.getForObject("http://zuul/m4/get"+"/"+n+"/"+d, Iterable.class);
		l.forEach(a->{list.add(a);});
		l1.forEach(b->{list.add(b);});
		l2.forEach(c->{list.add(c);});
		l3.forEach(x->{list.add(x);});
		return list;
	}
	
	@RequestMapping(value = "/updateM1",method = RequestMethod.PUT)
	public void updateM1(@RequestBody ShowDetails s)
	{
		rt.getForObject("http://zuul/m1/updateTicket",Void.class);
	}
	
	@RequestMapping(value = "/updateM2",method = RequestMethod.PUT)
	public void updateM2(@RequestBody ShowDetails s)
	{
		rt.getForObject("http://zuul/m2/updateTicket",Void.class);
	}
	
	@RequestMapping(value = "/updateM3",method = RequestMethod.PUT)
	public void updateM3(@RequestBody ShowDetails s)
	{
		rt.getForObject("http://zuul/m3/updateTicket",Void.class);
	}
	
	@RequestMapping(value = "/updateM4",method = RequestMethod.PUT)
	public void updateM4(@RequestBody ShowDetails s)
	{
		rt.getForObject("http://zuul/m4/updateTicket",Void.class);
	}
}
