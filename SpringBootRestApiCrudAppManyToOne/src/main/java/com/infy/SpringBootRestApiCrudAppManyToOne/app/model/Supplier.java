package com.infy.SpringBootRestApiCrudAppManyToOne.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Supplier
{
	@Id
	private Integer supplierId;
	private String supplierName;
	private long supplierContact;
}
