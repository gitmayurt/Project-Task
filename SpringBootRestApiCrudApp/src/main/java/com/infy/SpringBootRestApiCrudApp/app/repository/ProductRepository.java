package com.infy.SpringBootRestApiCrudApp.app.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.SpringBootRestApiCrudApp.app.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>
{
	@Transactional
	public Product findByProductId(Integer id);
	@Transactional
	public void deleteByProductId(Integer id);

}
