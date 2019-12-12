package com.brathisv.learning;

public class MergeSort {

	public static void main(String[] args) {
		int[] input = {4,2,6,8,9,12,4,30};
		divide(input, 0, input.length-1);
		printArray(input);
	}
	
	static void printArray(int[] input) {
		for(int i: input) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static void divide(int[] input, int start, int end) {
		if(start < end ) {
			int mid = (start + end) / 2;
			divide(input, start, mid);
			divide(input, mid+1, end);
			merge(input,start, mid, end);
		}
	}
	
	private static void merge(int[] input, int start, int mid, int end) {
		int i = start;
		int j = mid+1;
		int k = start;
		int[] output = new int[input.length];
		while(i <= mid && j <= end) {
			if(input[i] <= input[j]) {
				output[k] = input[i];
				i++;
			}else {
				output[k] = input[j];
				j++;
			}
			k++;
		}
		
		if(i > mid) {
			while(j <= end) {
				output[k] = input[j];
				j++;k++;
			}
		}else  {
			while(i<=mid) {
				output[k] = input[i];
				i++;
				k++;
			}
		}
		
		for(int r=start;r<=end;r++) {
			input[r] = output[r];
		}
		
	}

}
