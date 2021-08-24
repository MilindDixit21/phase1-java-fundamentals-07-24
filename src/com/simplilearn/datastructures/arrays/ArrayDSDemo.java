package com.simplilearn.datastructures.arrays;

public class ArrayDSDemo {

	public static void main(String[] args) {
		int[] items = {-15,26,56,15,14,25,15,25,80 };
		display(items);

	}

	private static void display(int[] items) {
		
		for (int index =0; index <items.length; index++) {
			System.out.println("The index : "+index+"and value :"+items[index]);
		}
		
		for (int item :items){
			System.out.println("the value "+ item);
		}
	}

}
