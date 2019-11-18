package com.brathisv.spring;

public class Circle {

	private String type;
	
	public Circle(String type) {
		this.type = type;
	}
	
	public void draw() {
		System.out.println(this.type + " is circle");
	}
}
