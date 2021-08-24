package com.simplilearn.typecasting;

public class StringToNumericConvertor {

	public static void main(String[] args) {
		//string to numeric
		
		String username = "abc123"; //non convertible string
		String price = "123.45";	// convertible string
		String amount = "2456";		// convertible string
		
		// string (non-primitive type) to int (primitive type) => wrapper class
		
		int intAmount = Integer.parseInt(amount);
		double doubleAmount = Double.parseDouble(amount);
		
		//non-convertible string :> NumberFormatException
		//int result = Integer.parseInt(username);
		
		
		System.out.println("Integer Amount :"+intAmount);
		System.out.println("Double Price :"+ doubleAmount);
	}

}
