package com.cjc.web.crud.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.web.crud.dao.HomeDao;
import com.cjc.web.crud.model.Student;
import com.cjc.web.crud.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService 
{
	@Autowired
	HomeDao d;

	@Override
	public void save(Student s) {
		// TODO Auto-generated method stub
		d.save(s);
	}

	@Override
	public void login(String ml, String ps) {
		// TODO Auto-generated method stub
		d.login(ml,ps);
	}

	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		return d.display();
	}

	@Override
	public void delete(int r) {
		// TODO Auto-generated method stub
		d.delete(r);
	}

	@Override
	public Student getSingle(int r) {
		// TODO Auto-generated method stub
		return d.getSingle(r);
	}

	@Override
	public void update(Student s) {
		// TODO Auto-generated method stub
		d.update(s);
	}
	
}
