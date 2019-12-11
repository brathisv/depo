package com.brathisv.learning;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		radixSort(new int[] {32,5,7,54,5,6,101,0,9,8,7,6,7,9,200,2,2});
	}
	

	public static int[] countingSort(int[] input) {
		int[] output = new int[input.length];
		printArray(output);
		//find the maximum number
		int max = findMax(input);
		System.out.println("input ");
		printArray(input);
		int[] count = new int[max+1];
		for(int i: input) {
			count[i]++;
		}
		System.out.println("Count ");
		printArray(count);
		for(int i=1;i<count.length;i++) {
			count[i] += count[i-1];
		}
		System.out.println("Position ");
		printArray(count);
		for(int i=input.length-1;i>=0;i--) {
			output[--count[input[i]]] = input[i];
		}
		System.out.println("Sorted Array complexity : O(n+max number)");
		printArray(output);
		return output;
	}


	private static int findMax(int[] input) {
		int max = 0;
		for(int i: input) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	
	private static void printArray(int[] input) {
		for(int i: input) {
			System.out.print(i + ",");
		}
		System.out.println();
	}
	
	
	public static void radixSort(int[] input) {
		int max = findMax(input);
		System.out.println("Max number is "+ max);
		for(int i =1;max/i>0;i*=10) {
			System.out.println("LSB "+ i);
			input = countingSortForIndex(input,i);
		}
	}


	private static int[] countingSortForIndex(int[] input, int exp) {
		int[] output = new int[input.length];
		int[] count = new int[10];
		for(int i=0;i<input.length;i++) {
			count[(input[i]/exp)%10]++;
		}
		System.out.println("Count ");
		printArray(count);
		for(int i=1;i<count.length;i++) {
			count[i] += count[i-1];
		}
		System.out.println("Position ");
		printArray(count);
		for(int i=input.length-1;i>=0;i--) {
			int j = --count[(input[i]/exp%10)];
			output[j] = input[i];
		}
		System.out.println("Sorted Array ");
//		input = Arrays.copyOf(output, output.length);
		printArray(output);
		return output;
		
	}
	

}
