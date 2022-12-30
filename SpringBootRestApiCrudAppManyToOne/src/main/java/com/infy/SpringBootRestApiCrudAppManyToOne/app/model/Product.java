package com.infy.SpringBootRestApiCrudAppManyToOne.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product 
{
	@Id
	private Integer productId;
	private String productName;
	private Double productPrice;
	@ManyToOne
	private Supplier supplier;
}
