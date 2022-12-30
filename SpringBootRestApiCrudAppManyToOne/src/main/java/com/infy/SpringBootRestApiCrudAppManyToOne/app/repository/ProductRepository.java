package com.infy.SpringBootRestApiCrudAppManyToOne.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infy.SpringBootRestApiCrudAppManyToOne.app.model.Product;

@Repository
@Transactional
public interface ProductRepository extends CrudRepository<Product, Integer>
{

	public Product findByProductId(int id);

	public void deleteByProductId(int id);

}
