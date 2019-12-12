package com.brathisv.learning;

public class BubbleSort {

	public static void main(String[] args) {
		int[] input = {15,2,8,3,9,10,3,5,250,102};
		printArray(sort(input));
	}
	
	public static int[] sort(int[] input) {
		int n = input.length;
		boolean isSwapped = false;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<(n-i-1);j++) {
				if(input[j] > input[j+1]) {
					isSwapped = true;
					input[j] = input[j] + input[j+1];
					input[j+1] = input[j] - input[j+1];
					input[j] -= input[j+1];
//					int temp = input[j];
//					input[j] = input[j+1];
//					input[j+1] = temp;
				}
			}
			if(!isSwapped) {
				break;
			}
			isSwapped = false;
		}
		return input;
	}
	
	static void printArray(int[] input) {
		for(int i: input) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
