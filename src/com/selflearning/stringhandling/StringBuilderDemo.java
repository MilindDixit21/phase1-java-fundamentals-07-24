package com.selflearning.stringhandling;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		// StringBuilder - No thread safe
		// mutable string
		StringBuilder message = new StringBuilder("Today is a good day! ");
		System.out.println(message);
		
		// append new string text
		message.append("Happy Learing!!");
		System.out.println(message);
		
		// replace text
		message.replace(0, 1, "Y");
		System.out.println(message);
		
		// delete text
		message.delete(5, 8);
		System.out.println(message);
		
		//insert text
		message.insert(0, "Welcome.. ");
		System.out.println(message);

	}

}
