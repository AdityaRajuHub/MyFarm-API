package com.naa.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naa.model.Product;
import com.naa.service.ProductService;

@RestController(value = "product")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@RequestMapping(value = "/product/getAll")
	public List<Product> getProducts() {
		
		List<Product> products = new ArrayList<Product>();
		try {
			
			products = productService.getAllProducts();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

}
