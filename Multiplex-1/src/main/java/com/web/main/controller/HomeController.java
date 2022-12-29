package com.web.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.model.ShowDetails;
import com.web.main.service.HomeService;

@RestController
public class HomeController
{
	@Autowired
	HomeService hs;

	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String save(@RequestBody ShowDetails s)
	{
		hs.save(s);
		return "Data Saved";
	}
	
	@RequestMapping(value = "/get/{name}/{date}",method = RequestMethod.GET)
	public Iterable<ShowDetails> get(@PathVariable("name") String n,@PathVariable("date") String d)
	{
		Iterable<ShowDetails> l=hs.getShow(n,d);
		return l;
	}
	
	@RequestMapping(value = "/updateTicket",method = RequestMethod.PUT)
	public void updateNoOfTicket(@RequestBody ShowDetails s)
	{
//		Iterable<ShowDetails> l=hs.getShow();
//		l.forEach(show->{
//			int newTicket=show.getTicket()-s.getTicket();
//			show.setTicket(newTicket);
//			hs.save(show);
//		});
		ShowDetails sd=hs.singleData(s.getId());
		int newTicket=sd.getTicket()-s.getTicket();
		sd.setTicket(newTicket);
		hs.save(sd);
	}
}
