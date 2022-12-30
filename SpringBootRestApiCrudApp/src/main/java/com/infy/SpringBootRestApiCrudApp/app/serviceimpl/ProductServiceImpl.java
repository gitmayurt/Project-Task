package com.infy.SpringBootRestApiCrudApp.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.SpringBootRestApiCrudApp.app.model.Product;
import com.infy.SpringBootRestApiCrudApp.app.repository.ProductRepository;
import com.infy.SpringBootRestApiCrudApp.app.servicei.ProductServiceI;
@Service
@Transactional(readOnly = false)
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
		//return pr.findAll();
		//return pr.get();
		return pr.getAll();
	}

	@Override
	public void deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		//pr.deleteByProductId(id);
		pr.delete(id);
	}

	@Override
	public void updateProduct(Integer id, Product p) {
		// TODO Auto-generated method stub
		Product pd=pr.findByProductId(id);
		pd.setProductName(p.getProductName());
		pd.setProductPrice(p.getProductPrice());
		pr.save(pd);
	}

	@Override
	public Product getPro(int id) {
		// TODO Auto-generated method stub
		//return pr.getPro(id);
		return pr.getSingle(id);
	}

	@Override
	public Product getProName(String name) {
		// TODO Auto-generated method stub
		return pr.getProName(name);
	}

	@Override
	public void update(String name, int id) {
		// TODO Auto-generated method stub
		pr.update(id, name);
	}

	@Override
	public void updatePro(String name, Double price) {
		// TODO Auto-generated method stub
		pr.updatePro(price, name);
	}

}
