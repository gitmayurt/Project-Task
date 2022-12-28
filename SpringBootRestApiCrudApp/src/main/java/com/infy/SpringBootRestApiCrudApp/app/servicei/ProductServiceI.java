package com.infy.SpringBootRestApiCrudApp.app.servicei;

import com.infy.SpringBootRestApiCrudApp.app.model.Product;

public interface ProductServiceI {

	public void saveProduct(Product p);

	public Iterable<Product> getProduct();

	public Product getSingleProduct(Integer id);

	public void deleteProduct(Integer id);

}
