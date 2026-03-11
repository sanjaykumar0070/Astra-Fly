package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.model.Product;
import com.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElse(null);
	}

	
}
