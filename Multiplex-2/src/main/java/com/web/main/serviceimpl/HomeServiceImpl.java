package com.web.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.main.model.ShowDetails;
import com.web.main.repository.HomeRepository;
import com.web.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired
	HomeRepository hr;

	@Override
	public void save(ShowDetails s) {
		// TODO Auto-generated method stub
		hr.save(s);
	}

	@Override
	public Iterable<ShowDetails> getShow(String n, String d) {
		// TODO Auto-generated method stub
		return hr.findAllByNameAndDate(n,d);
	}

	@Override
	public ShowDetails singleData(int id) {
		// TODO Auto-generated method stub
		return hr.findById(id);
	}

}
