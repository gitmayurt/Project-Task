package com.infy.SpringBootRestApiCrudAppManyToOne.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.SpringBootRestApiCrudAppManyToOne.app.model.Product;
import com.infy.SpringBootRestApiCrudAppManyToOne.app.repository.ProductRepository;
import com.infy.SpringBootRestApiCrudAppManyToOne.app.servicei.ProductServiceI;

@Service
public class ProductServiceImpl implements ProductServiceI
{
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
	public void updateProduct(int id, Product p) {
		// TODO Auto-generated method stub
		Product pd=pr.findByProductId(id);
		pd.setProductName(p.getProductName());
		pd.setProductPrice(p.getProductPrice());
		pr.save(pd);
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		pr.deleteByProductId(id);
	}

}
