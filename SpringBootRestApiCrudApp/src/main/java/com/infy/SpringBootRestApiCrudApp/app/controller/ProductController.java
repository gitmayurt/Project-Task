package com.infy.SpringBootRestApiCrudApp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<String> saveProduct(@RequestBody Product p)
	{
		ps.saveProduct(p);
		String s="Resource created successfully";
		return new ResponseEntity<>(s,HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/products")
	public ResponseEntity<Iterable<Product>> getProduct()
	{
		Iterable<Product> list=ps.getProduct();
		return new ResponseEntity<Iterable<Product>>(list,HttpStatus.OK);
	}
	
	@PutMapping(value = "/product/{productId}")
	public ResponseEntity<String> updateProduct(@RequestBody Product p,@PathVariable("productId") Integer id)
	{
		ps.updateProduct(id,p);
		String s="Resource updated successfully";
		return new ResponseEntity<>(s,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/product/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable("productId") Integer id)
	{
		System.out.println(id);
		ps.deleteProduct(id);
		String s="There is not any content to show";
		return new ResponseEntity<>(s,HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/product/{productId}")
	public Product getPro(@PathVariable("productId") int id)
	{
		Product p=ps.getPro(id);
		return p;
	}
	
	@GetMapping("/productName/{productName}")
	public Product getProName(@PathVariable("productName") String name)
	{
		Product p=ps.getProName(name);
		return p;
	}
	
	@PutMapping("/update/{productName}/{productId}")
	public Product update(@PathVariable("productName") String name,@PathVariable("productId") int id)
	{
		ps.update(name,id);
		Product p=ps.getPro(id);
		return p;
	}
	
	@PutMapping("/updatePro/{productPrice}/{productName}")
	public Product updatePro(@PathVariable("productName") String name,@PathVariable("productPrice") Double price)
	{
		ps.updatePro(name,price);
		Product p=ps.getProName(name);
		return p;
	}
}
