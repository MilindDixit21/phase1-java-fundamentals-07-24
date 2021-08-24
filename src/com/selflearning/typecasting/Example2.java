package com.selflearning.typecasting;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO WAP for converting long, float, int => byte, short, double.
		
		// collect user input long number
		Scanner input = new Scanner(System.in);
		System.out.println("::Enter a long number value");
		long userInput = input.nextLong();
		
		// long => byte, short, double.
		//System.out.println("user input long :"+userInput);
		
		byte byteValue = (byte) userInput;	//explicit type cast
		short shortValue = (short) userInput; //explicit type cast
		double doubleValue = userInput; //implicit type cast

		System.out.println("Byte Value :"+byteValue);
		System.out.println("Short Value :"+shortValue);
		System.out.println("Double Value :"+doubleValue);
		System.out.println("-------------------------------");
		
		// float => byte, short, double.
		Scanner inputFloat = new Scanner(System.in);
		System.out.println("::Enter a float number value");
		float userInputFloat = input.nextFloat();
		
		byte byteValue1 = (byte) userInputFloat; // Explicit type cast	
		short shortValue1 = (short) userInputFloat; // Explicit type cast
		double doubleValue1 = userInputFloat; // Implicit type cast
		
		System.out.println("Byte Value :"+byteValue1);
		System.out.println("Short Value :"+shortValue1);
		System.out.println("Double Value :"+doubleValue1);
		System.out.println("-------------------------------");
		
		// int => byte, short, double.
		Scanner inputInt = new Scanner(System.in);
		System.out.println("::Enter an Integer Number Value:");
		int userInputInt = input.nextInt();
		
		byte byteValue2 = (byte) userInputInt; // Explicit type cast
		short shortValue2 = (short) userInputInt; //Explicit type cast
		double doubleValue2 = userInputInt; // Implicit type cast
		
		System.out.println("Byte Value :"+byteValue2);
		System.out.println("Short Value :"+shortValue2);
		System.out.println("Double Value :"+doubleValue2);
		System.out.println("-------------------------------");
	}

}
