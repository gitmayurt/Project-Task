package com.infy.SpringBootRestApiCrudApp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.SpringBootRestApiCrudApp.app.model.Product;
import com.infy.SpringBootRestApiCrudApp.app.servicei.ProductServiceI;
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class ProductController
{
	@Autowired
	ProductServiceI ps;

	@PostMapping(value = "/product")
	public void saveProduct(@RequestBody Product p)
	{
		ps.saveProduct(p);
	}
	
	@GetMapping(value = "/products")
	public Iterable<Product> getProduct()
	{
		Iterable<Product> list=ps.getProduct();
		return list;
	}
	
	@PutMapping(value = "/product/{productId}")
	public void updateProduct(@RequestBody Product p,@PathVariable("productId") Integer id)
	{
		System.out.println("********************************************************");
		System.out.println(id);
		Product pr=ps.getSingleProduct(id);
		pr.setProductId(p.getProductId());
		pr.setProductName(p.getProductName());
		pr.setProductPrice(p.getProductPrice());
		ps.saveProduct(pr);
	}
	
	@DeleteMapping(value = "/product/{productId}")
	public void deleteProduct(@PathVariable("productId") Integer id)
	{
		System.out.println(id);
		ps.deleteProduct(id);
	}
}
