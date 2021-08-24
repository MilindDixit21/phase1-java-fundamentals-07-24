package com.simplilearn.typecasting;

import java.util.Scanner;

public class NumericDataConvertor {

	public static void main(String[] args) {
		
		// step 1: collect input from user console
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Interger number value");
	
		int userInput = input.nextInt();
		
		//step 2: convert user input into different 
		//implicit type cast: lower to higher
		
		long bigValue = userInput;
		float floatValue = userInput;
		double doubleValue = userInput;
		
		// step 3 : 
		// explicit type cast: higher to lower
		
		byte smallValue = (byte)userInput; 
		short shortValue = (short) userInput;
		

		System.out.println("Long Value: "+bigValue);
		System.out.println("Float Value: "+floatValue);
		System.out.println("Double Value: "+doubleValue);
		System.out.println("Byte Value :"+ smallValue);
		System.out.println("Short Value :"+ shortValue);
		
	}

}
