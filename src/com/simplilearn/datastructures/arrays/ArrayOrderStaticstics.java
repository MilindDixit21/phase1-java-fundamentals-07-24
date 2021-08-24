package com.simplilearn.datastructures.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOrderStaticstics {

	public static void main(String[] args) {
		// identify kth smallest & largest
		
		int[] items = {-15 ,20, 24, 50, 26, 78, 90};
		int pos =3;
		
		int result = findKthSmallest(items,pos);
		System.out.println("the position " +pos +"basesd smallerst element "+ result);
		
		int result2 = findKthLargest(items,pos);
		System.out.println("the pos " +pos +"basesd largetst element "+ result2);

	}

	private static int findKthSmallest(int[] items, int pos) {
		
		//sort array in ascending order
	Arrays.sort(items);
		
		// return kth smallest
		
		return items[pos-1];
	}
	
private static int findKthLargest(int[] items, int pos) {
		
		//sort array in ascending order
	Arrays.sort(items);	
		System.out.println(Arrays.toString(items)); // displaying arrays 
		// return kth largest
		
	return items[items.length-pos]; // for reverse order last index - position
	}

}
