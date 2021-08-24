package com.simplilearn.typecasting;

public class Example1 {

	public static void main(String[] args) {
		// TODO: WAP for converting int, byte, short => float, double, long
		// Implicit type cast
		
		byte smallAmount = 100;
		int intAmount = smallAmount;
		short shortAmount = smallAmount;
		
		float floatAmount = intAmount; // int => float
		long longAmount = shortAmount; // short => float
		double doubleAmount = smallAmount; // byte => double
		
		
		System.out.println("Float Amount : "+floatAmount);
		System.out.println("Double Amount : "+doubleAmount);
		System.out.println("Long Amount : "+longAmount);
		

	}

}
