package com.selflearning.typecasting;

public class Example1 {

	public static void main(String[] args) {
		
		// int => float, double, long ... Implicit type cast
		int number = 234;
		float fnumber = number;
		double dnumber = number;
		long lnumber = number;
		
		//byte => float, double, long -- Implicit type case
		byte byteNumber = 123;
		float flNumber = byteNumber;
		double douNumber = byteNumber;
		long lonNumber = byteNumber;
		
		// short => float, double, long -- Implicit type cast
		
		short shortNumber = 1234;
		float floatNumber = shortNumber;
		double doubleNumber = shortNumber;
		long longNumber = shortNumber;
		
		System.out.println("------ Integer => float, double , long --------");
		System.out.println("Float :"+fnumber);
		System.out.println("Double :"+dnumber);
		System.out.println("Long :"+lnumber);
		System.out.println("------ Byte => float, double , long --------");
		System.out.println("Float :"+flNumber);
		System.out.println("Double :"+douNumber);
		System.out.println("Long :"+lonNumber);
		System.out.println("------ Short => float, double , long --------");
		System.out.println("Float :"+floatNumber);
		System.out.println("Double :"+doubleNumber);
		System.out.println("Long :"+longNumber);

	}

}
