package com.selflearning.typecasting;

public class StringtoNumericConvertor {

	public static void main(String[] args) {
		// String to numeric
		
		String price ="123.99";	// convertible string
		String amount ="542";	// convertible string
		String username ="abcd1234";	// non convertible string
		
		// String (non-primitive type) to int (primitive type) = need ==> wrapper class
		
		int intAmount = Integer.parseInt(amount);
		float floatPrice = Float.parseFloat(price);
		double doublePrice = Double.parseDouble(price);
		
		// non convertible string to primitive type :> NumberFormatException
		//does not give error at compiling time. :> when run the program :> runtime Error => NumberFormatException
		/**
		 * int intUsername = Integer.parseInt(username);
		 * System.out.println("Integer Username :"+intUsername); 
		 */
		
		
		System.out.println("Integer Amount :"+intAmount);
		System.out.println("Float Price :"+floatPrice);
		System.out.println("Double Price :"+doublePrice);

	}

}
