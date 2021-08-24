package com.simplilearn.datastructures.arrays;

import java.util.Arrays;

public class ArrayRotationDemo {
	
	public static void main(String[] args) {
		int [] items = {-15 ,20, 24, 50, 36, 26, 78, 90};
		
		// 26, 78, 90, -15 ,20, 24, 50, 36 :> shift right : rotate element by 3
		
		
		
//		System.out.println("Before Rotatation :");
//		System.out.println(Arrays.toString(items));
//		rotateRight(items,3);
//		System.out.println("After Rotatation :");
//		System.out.println(Arrays.toString(items));
		
		
		System.out.println("---------");
		System.out.println("Before Rotatation :");
		System.out.println(Arrays.toString(items));
		rotateLeft(items, 4);
		System.out.println("After Rotatation :");
		System.out.println(Arrays.toString(items));
		
	}
	
	
	// right to left
	private static void rotateRight(int[] items, int cRotate) {
		
		if(cRotate > items.length)
			cRotate = cRotate % items.length; // rotate count shoud not greater than array length
		
		
		int temp[] = new int [items.length]; // to generate same items elements of array 
		
		// shift element into temp array.
		for(int i =0; i<cRotate; i++) {
			temp[i] = items[items.length-cRotate+i];
		}
		// System.out.println(Arrays.toString(temp));
		
		// rotate actual array.
		int j=0;
		for (int i = cRotate; i < temp.length; i++) {
			temp[i] = items[j];
			j++;
		}
		//System.out.println(Arrays.toString(temp));
		
		// copy to items array
		System.arraycopy(temp, 0, items, 0, items.length);
	}
	
	private static void rotateLeft(int[] items, int cRotate) {
		
		int temp[] = new int [cRotate];
		
		for (int i = 0; i < cRotate; i++) {
			temp[i] = items[i];
			
		}
		//System.out.println(Arrays.toString(temp));
		
		// shift /move actual array
		
		for (int i = cRotate; i < items.length; i++) {
			//shifting into items array
			items[i-cRotate] = items[i];		
			
		}
		
		// copy the temp element into actual array
		for (int i = 0; i < cRotate; i++) {
			items[i+items.length-cRotate] = temp[i];
		}
		
	}

}
