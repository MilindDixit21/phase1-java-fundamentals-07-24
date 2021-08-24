package com.selflearning.typecasting;

import java.util.Scanner;

public class NumericDataConvertor {

	public static void main(String[] args) {
		
		// 1. collect input data from user console
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer number value");
		
		int userInput = input.nextInt();
		
		
		// 2. convert user input into different number format
		
		long longNumber = userInput; // implicit
		double doubleNumber = userInput; //implicit
		byte byteNumber = (byte)userInput; //explicit
		short shortNumber = (short) userInput; //explicit
		
		System.out.println("Integer Value :"+userInput);
		System.out.println("Long Value :"+longNumber); 
		System.out.println("Double Value :"+doubleNumber); 
		System.out.println("Short Value :"+shortNumber); 
		System.out.println("Byte Value :"+byteNumber); 
		
	

	}

}
