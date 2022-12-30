package com.web.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.main.model.ShowDetails;

@Repository
public interface HomeRepository extends CrudRepository<ShowDetails, Integer> 
{

	public ShowDetails findById(int id);

	public Iterable<ShowDetails> findAllByNameAndDate(String n, String d);
}
