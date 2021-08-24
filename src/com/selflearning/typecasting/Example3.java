package com.selflearning.typecasting;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO WAP for string to number value ( byte, short,int, long, double, float)
		// collect user input from console
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String value");
		
		String inputString = input.nextLine();
		//System.out.println("user input String :"+inputString);
		
		// string to number value
		
		byte byteValue = Byte.parseByte(inputString);	// <127 as user input value
		System.out.println("Byte Value :"+byteValue);
		
		short shortValue = Short.parseShort(inputString);	// user input value
		System.out.println("Short Value :"+shortValue);
		
		int intValue = Integer.parseInt(inputString);	// user input value
		System.out.println("Integer Value :"+intValue);
		
		long longValue = Long.parseLong(inputString); 	// user input value
		System.out.println("Long Value :"+longValue);
		
		double doubleValue = Double.parseDouble(inputString); // use decimal value as user input value
		System.out.println("Double Value :"+doubleValue);
		
		float floatValue = Float.parseFloat(inputString); // use decimal value as user input value
		System.out.println("Float Value :"+floatValue);
		
		boolean bValue = Boolean.parseBoolean(inputString);  // use True or false as user input value
		System.out.println("Boolean Value :"+bValue);
		
	

	}

}
