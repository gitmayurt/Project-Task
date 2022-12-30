package com.infy.SpringBootRestApiCrudAppManyToOne.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.SpringBootRestApiCrudAppManyToOne.app.model.Supplier;
import com.infy.SpringBootRestApiCrudAppManyToOne.app.servicei.SupplierServiceI;
@CrossOrigin("*")
@RestController
@RequestMapping("/supplier")
public class SupplierController
{
	@Autowired
	SupplierServiceI ss;
	
	@PostMapping("/supplier/supplier")
	public ResponseEntity<Supplier> saveSupplier(@RequestBody Supplier s)
	{
		ss.saveSupplier(s);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/supplier/suppliers")
	public ResponseEntity<Iterable<Supplier>> getSupplier()
	{
		Iterable<Supplier> list=ss.getSupplier();
		return new ResponseEntity<Iterable<Supplier>>(list,HttpStatus.CREATED);
	}
	
	@PostMapping("/supplier/supplier/{supplierId}")
	public ResponseEntity<Supplier> updateSupplier(@PathVariable("supplierId") int id,@RequestBody Supplier s)
	{
		ss.updateSupplier(id,s);
		return new ResponseEntity<>(HttpStatus.OK);
	} 
	
	@DeleteMapping("/supplier/supplier/{supplierId}")
	public ResponseEntity<Supplier> deleteSupplier(@PathVariable("supplierId") int id)
	{
		ss.deleteSupplier(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
