package com.infy.SpringBootRestApiCrudApp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.SpringBootRestApiCrudApp.app.model.Product;
import com.infy.SpringBootRestApiCrudApp.app.repository.ProductRepository;
import com.infy.SpringBootRestApiCrudApp.app.servicei.ProductServiceI;
@Service
public class ProductServiceImpl implements ProductServiceI{

	@Autowired
	ProductRepository pr;
	
	@Override
	public void saveProduct(Product p) {
		// TODO Auto-generated method stub
		pr.save(p);
	}

	@Override
	public Iterable<Product> getProduct() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public Product getSingleProduct(Integer id) {
		// TODO Auto-generated method stub
		return pr.findByProductId(id);
	}

	@Override
	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		pr.deleteByProductId(id);
	}

}
