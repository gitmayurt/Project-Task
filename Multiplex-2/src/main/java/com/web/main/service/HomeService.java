package com.web.main.service;

import com.web.main.model.ShowDetails;

public interface HomeService {

	public void save(ShowDetails s);

	public Iterable<ShowDetails> getShow(String n, String d);

	public ShowDetails singleData(int id);

}
