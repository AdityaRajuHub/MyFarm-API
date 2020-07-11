package com.naa.response;

import java.util.List;
import com.google.common.collect.Lists;
import com.naa.model.Product;

public class ProductListResponse  {
	List<Product> products = Lists.newArrayList();

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	

}
