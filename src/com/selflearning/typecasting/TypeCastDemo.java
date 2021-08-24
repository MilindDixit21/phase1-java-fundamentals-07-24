package com.selflearning.typecasting;

public class TypeCastDemo {

	public static void main(String[] args) {
		// implicit type cast : Automatically
		/**
		 * Widening type cast : Converts data from lower range value to Higher range
		 * byte -> short -> int -> long -> float -> double.
		 */ 
		
		byte smallCount = 100;
		
		int intCount = smallCount; //widening byte => int
		
		long bigCount = intCount;
		
		float floatCount = bigCount;
		
		double decimalCount = smallCount;
		
		System.out.println("Byte Count :"+smallCount);
		System.out.println("Integer Count :"+intCount);
		System.out.println("Long Count :"+bigCount);
		System.out.println("Float Count :"+floatCount);
		System.out.println("Double Count :"+decimalCount);
		
	}

}
