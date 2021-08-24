package com.selflearning.typecasting;

public class TypeCastDemo2 {

	public static void main(String[] args) {
		// Explicit type cast : does not happen automatically
		/**
		 * Narrowowing : Converts data to incompatible type
		 * Convert data from higher range value to lower range value
		 * double -> float ->long ->int ->short ->byte.
		 */
		
		double price = 1550.77d;			
		float floatPrice = (float) price;	// double => float 
		long bigPrice = (long)floatPrice;	// float => long
		int intPrice = (int) price;		// double => int 
		byte bytePrice = (byte) price;  // double => byte
		short shortPrice = (short) bigPrice; //	long => short
		
		System.out.println("Double Price :"+price);
		System.out.println("Float Price :"+floatPrice);
		System.out.println("Long Price :"+bigPrice);
		System.out.println("Interger Price :"+intPrice);
		System.out.println("Short Price :"+shortPrice);
		System.out.println("Byte Price :"+bytePrice);
		
		
	}

}
