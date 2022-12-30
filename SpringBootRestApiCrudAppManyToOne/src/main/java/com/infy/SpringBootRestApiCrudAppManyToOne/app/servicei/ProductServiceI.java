package com.infy.SpringBootRestApiCrudAppManyToOne.app.servicei;

import java.util.List;

import com.infy.SpringBootRestApiCrudAppManyToOne.app.model.Product;

public interface ProductServiceI {

	public void saveProduct(Product p);

	public Iterable<Product> getProduct();

	public void updateProduct(int id, Product p);

	public void deleteProduct(int id);

}
