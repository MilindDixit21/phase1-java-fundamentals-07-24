package com.simplilearn.typecasting;

public class TypeCastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte smallCount = 122;	
		int intCount = smallCount; 	//widening => byte -> Interger
		long bigCount = intCount; 	// Widening => int -> long
		float floatCount = bigCount; // widening => long -> float
		float floatCount1 = intCount; //widening => int -> float
		double decimalCount = bigCount; // widening => long -> double
		
		System.out.println("Byte count : "+ smallCount);
		System.out.println("Integer Count : "+ intCount);
		System.out.println("Long Count : "+ bigCount);
		System.out.println("Float Count : "+ floatCount);
		System.out.println("Float Count1 : "+ floatCount1);
		System.out.println("Double Count :" + decimalCount);

		

	}

}
