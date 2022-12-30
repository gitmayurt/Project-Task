package com.infy.SpringBootRestApiCrudAppManyToOne.app.controller;

import java.util.List;

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

import com.infy.SpringBootRestApiCrudAppManyToOne.app.model.Product;
import com.infy.SpringBootRestApiCrudAppManyToOne.app.servicei.ProductServiceI;
@CrossOrigin("*")
@RestController
@RequestMapping("/product")
public class ProductController
{
	@Autowired
	ProductServiceI ps;
	
	@PostMapping("/product/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product p)
	{
		ps.saveProduct(p);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/product/products")
	public ResponseEntity<Iterable<Product>> getProduct()
	{
		Iterable<Product> list=ps.getProduct();
		return new ResponseEntity<Iterable<Product>>(list,HttpStatus.OK);
	}
	
	@PutMapping("/product/product/{productId}")
	public ResponseEntity<Product> updateProduct(@PathVariable("productId") int id,@RequestBody Product p)
	{
		ps.updateProduct(id,p);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/product/product/{productId}")
	public ResponseEntity<Product> deleteProduct(@PathVariable("productId") int id)
	{
		ps.deleteProduct(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
