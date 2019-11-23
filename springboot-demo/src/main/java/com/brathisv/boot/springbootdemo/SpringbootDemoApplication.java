package com.brathisv.boot.springbootdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.brathisv.boot.springbootdemo.model.Product;
import com.brathisv.boot.springbootdemo.model.ProductRepository;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(ProductRepository productRepository) {
		return args -> {
			productRepository.save(new Product("Burfi"));
			productRepository.save(new Product("Finegrained Burfi"));
			productRepository.save(new Product("Karachi Biscuits"));
		};
	}
}
