package com.brathisv.learning;

@FunctionalInterface
public interface Lamda {

	int add(int a, int b);
	
	public default int multiply(int a, int b) {
		return a * b;
	}
}
