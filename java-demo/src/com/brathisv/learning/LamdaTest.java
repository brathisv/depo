package com.brathisv.learning;

public class LamdaTest {

	public static void main(String[] args) {
		Lamda l = (a, b) -> a + b;
		System.out.println(l.add(12, 12));
		System.out.println(l.multiply(2, 12));
	}
	
}
