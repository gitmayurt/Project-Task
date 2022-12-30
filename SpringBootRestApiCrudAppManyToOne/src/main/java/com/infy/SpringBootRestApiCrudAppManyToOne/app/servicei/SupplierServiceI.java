package com.infy.SpringBootRestApiCrudAppManyToOne.app.servicei;

import com.infy.SpringBootRestApiCrudAppManyToOne.app.model.Supplier;

public interface SupplierServiceI {

	public void saveSupplier(Supplier s);

	public Iterable<Supplier> getSupplier();

	public void updateSupplier(int id, Supplier s);

	public void deleteSupplier(int id);

}
