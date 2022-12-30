package com.infy.SpringBootRestApiCrudApp.app.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.infy.SpringBootRestApiCrudApp.app.model.Product;
@org.springframework.transaction.annotation.Transactional
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>
{
	@Transactional
	public Product findByProductId(Integer id);
	@Transactional
	public void deleteByProductId(Integer id);

	//@Query(value = "select * from Product",nativeQuery = true)
	@Query(value = "from Product")
	public Iterable<Product> get();
	
	@Query("from Product p where p.productId=:pid")
	public Product getPro(@Param("pid") int id);
	
	@Query("from Product p where p.productName=:pname")
	public Product getProName(@Param("pname") String name);
	
	@Modifying
	@Query("update Product p set p.productName=:pname where p.productId=:pid")
	public void update(@Param("pid") int id,@Param("pname") String name);
	@Modifying
	@Query("delete from Product where productId=:pid")
	public void delete(@Param("pid") int id);
	
	@Procedure("getAllProducts")
	public Iterable<Product> getAll();
	
	@Procedure("findByProductId")
	public Product getSingle(int id);
	
	@Procedure("updateProduct")
	public void updatePro(Double price,String name);
	
	
}
