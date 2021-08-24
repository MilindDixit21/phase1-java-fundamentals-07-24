package com.simplilearn.typecasting;

public class TypeCastExplicit {

	public static void main(String[] args) {
		// Explicit typecast:
		// double => float => long => int => short => byte
		
		double price = 1500.77d;
		
		float floatPrice = (float) price;	// Narrowing double -> float
		int intPrice = (int) floatPrice;	// Narrowing float -> int
		byte bytePrice = (byte)floatPrice;
		
		
		System.out.println("Float Price :"+ floatPrice);
		System.out.println("Integer Price :"+ intPrice);
		System.out.println("Byte Price : "+bytePrice);
		
		

	}

}
