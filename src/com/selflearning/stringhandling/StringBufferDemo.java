package com.selflearning.stringhandling;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		// StringBuffer - thread safe
		// mutable string
		StringBuffer message = new StringBuffer("Today is a good day! ");
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

	}

}
