package com.infy.SpringBootRestApiCrudAppManyToOne.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infy.SpringBootRestApiCrudAppManyToOne.app.model.Supplier;
@Transactional
@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Integer>
{

	public Supplier findBySupplierId(int id);

	public void deleteBySupplierId(int id);

}
