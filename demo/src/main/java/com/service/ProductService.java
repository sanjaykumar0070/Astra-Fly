package com.service;

import java.util.List;

import com.model.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product getProductById(Long id);

}
