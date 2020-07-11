package com.naa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naa.dao.ProductDAO;
import com.naa.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductDAO productDAO;
	
	public List<Product> getAllProducts() {
		return (List<Product>) productDAO.findAll();
	}
}
