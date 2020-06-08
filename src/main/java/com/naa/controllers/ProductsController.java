package com.naa.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.naa.models.Product;
import com.naa.response.ProductListResponse;

@RestController
public class ProductsController {

	Gson responseGson = new Gson();

	@RequestMapping(value = "/products")
	public String getProducts() {
		ProductListResponse resp = new ProductListResponse();
		List<Product> productsList = Lists.newArrayList();
		try {
			//get from service
			Product p1 = new Product();
			p1.setId(1);
			p1.setName("Apple");
			productsList.add(p1);
			resp.setProducts(productsList);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		return responseGson.toJson(resp);
	}

}
