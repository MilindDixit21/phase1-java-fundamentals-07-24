package com.selflearning.arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//int numbers[] = new int [50];
		int numbers[] = {10,20,30,40,50,60,70};
		numbers[0] =100;
		numbers[1] =100;
		numbers[2] =100;
		numbers[3] =100;
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);
		
		// access element by index
		System.out.println("Element at index 0 :" +numbers[0]);
		System.out.println("Element at index 6 :" +numbers[6]);
		
		// access elements ith iterations
	}

}
