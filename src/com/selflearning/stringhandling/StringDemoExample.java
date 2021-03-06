package com.selflearning.stringhandling;

public class StringDemoExample {

	public static void main(String[] args) {
		// string literal
		String str1 = "John";
		String str2 = "John"; // it does not create a new string
		
		if(str1 == str2) {
			System.out.println("same string");
		}else {
			System.out.println("different string");
		}
		
		// Each time you create a string literal, the JVM checks the "string constant pool first.	
		// If the string already exists in the pool, a reference to the pooled instance is returned.
		
		System.out.println("-------------------------");
		// string by new keyword
		// each time new keyword is going to generate new string reference.
		
		String username1 = new String("John Smith");
		String username2 = new String("John Smith");
		if(username1 == username2) {
			System.out.println("same string");
		}else {
			System.out.println("different string");
		}
		
	}

}
