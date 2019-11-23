package com.brathisv.boot.springbootdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "product")
public class Product {

	@Id
	@GeneratedValue
	private long id;
	private String name;

	public long getId() {
		return id;
	}

	public Product(String name) {
		this.name = name;
	}
	
	public Product() {
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
