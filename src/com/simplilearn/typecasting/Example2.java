package com.simplilearn.typecasting;

public class Example2 {

	public static void main(String[] args) {
		// TODO : WAP for converting long, float, int => byte, short, double
		
		
		long longData = 5656;
		int intData = 452;
		float floatData = 185;
		
		// Implicit type case
		double doubleAmount = longData; 	//long => double
		double doubleAmount2 = floatData;	//float => double
		double doubleAmount3 = intData;		//int => double
		
		
		// Explicit type case
		
		byte byteAmount = (byte)longData; 	//long => byte
		short shortAmount = (short) floatData;	// float => short
		
		
		System.out.println("Double Amount : "+doubleAmount);
		System.out.println("Double Amount2 : "+doubleAmount2);
		System.out.println("Double Amount2 : "+doubleAmount3);
		
		System.out.println("Byte Amount : "+ byteAmount);
		System.out.println("Short Amount : "+shortAmount);
		
		

	}

}
