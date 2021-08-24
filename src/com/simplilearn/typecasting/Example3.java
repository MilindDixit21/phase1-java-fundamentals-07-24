package com.simplilearn.typecasting;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO : WAP for string to number value (byte, short, int, long, double, float)
		// collect user input from console
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string value");
		
		String userInput = input.nextLine();
		
		// string (non-primitive type) to primitive type => wrapper class
		
		//byte byteAmount = Byte.parseByte(userInput);
		
		//System.out.println(userInput);
		 
		 byte byteAmount = Byte.parseByte(userInput);
		 System.out.println("Byte Amount : "+ byteAmount);
		 
		 short shortAmount = Short.parseShort(userInput);
		 System.out.println("Short Amount :"+shortAmount);
		 
		 int intAmount = Integer.parseInt(userInput);
		 System.out.println("Integer Amount :"+intAmount);	
		 
		 long longAmount = Long.parseLong(userInput);
		 System.out.println("Long Amount : "+ longAmount);
		 
		 float floatAmount = Float.parseFloat(userInput);
		 System.out.println("Float Amount : "+ floatAmount);
		 
		 double doubleAmount = Double.parseDouble(userInput);
		 System.out.println("Double Amount : "+ doubleAmount);
		 
	}

}
