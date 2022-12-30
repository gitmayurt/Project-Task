package com.cjc.web.crud.service;

import java.util.List;

import com.cjc.web.crud.model.Student;

public interface HomeService {

	public void save(Student s);

	public void login(String ml, String ps);

	public List<Student> display();

	public void delete(int r);

	public Student getSingle(int r);

	public void update(Student s);

}
