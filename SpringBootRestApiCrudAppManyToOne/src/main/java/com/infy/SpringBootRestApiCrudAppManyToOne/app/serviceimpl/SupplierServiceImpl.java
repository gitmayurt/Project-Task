package com.infy.SpringBootRestApiCrudAppManyToOne.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.SpringBootRestApiCrudAppManyToOne.app.model.Supplier;
import com.infy.SpringBootRestApiCrudAppManyToOne.app.repository.SupplierRepository;
import com.infy.SpringBootRestApiCrudAppManyToOne.app.servicei.SupplierServiceI;

@Service
public class SupplierServiceImpl implements SupplierServiceI
{
	@Autowired
	SupplierRepository sr;
	
	@Override
	public void saveSupplier(Supplier s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

	@Override
	public Iterable<Supplier> getSupplier() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public void updateSupplier(int id, Supplier s) {
		// TODO Auto-generated method stub
		Supplier sp=sr.findBySupplierId(id);
		sp.setSupplierName(s.getSupplierName());
		sp.setSupplierContact(s.getSupplierContact());
		sr.save(sp);
	}

	@Override
	public void deleteSupplier(int id) {
		// TODO Auto-generated method stub
		sr.deleteBySupplierId(id);
	}

}
