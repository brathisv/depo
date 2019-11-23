package com.brathisv.boot.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brathisv.boot.springbootdemo.exception.ProductNotFoundException;
import com.brathisv.boot.springbootdemo.model.Product;
import com.brathisv.boot.springbootdemo.model.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/all")
	public List<Product> getAllProducts() {
		System.out.println("All one");
		return productRepository.findAll();
	}
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@GetMapping("/find/{id}")
	public Product findById(@PathVariable  long id) {
		System.out.println("Executing");
		return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id + " is not available"));
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		productRepository.deleteById(id);
	}
}
