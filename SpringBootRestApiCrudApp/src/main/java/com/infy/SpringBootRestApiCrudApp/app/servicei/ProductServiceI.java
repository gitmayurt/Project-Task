package com.infy.SpringBootRestApiCrudApp.app.servicei;

import com.infy.SpringBootRestApiCrudApp.app.model.Product;

public interface ProductServiceI {

	public void saveProduct(Product p);

	public Iterable<Product> getProduct();

	public void deleteProduct(Integer id);

	public void updateProduct(Integer id, Product p);

	public Product getPro(int id);

	public Product getProName(String name);

	public void update(String name, int id);

	public void updatePro(String name, Double price);
	
	

}
