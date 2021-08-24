package com.simplilearn.excption.Hnadling;

import java.io.IOException;

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		//throw - throw keyword is used to throw an exception
		ageValidator(20);
		try {
			
			ageValidator(10);
			
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		ageValidator(100);
		
		System.out.println("----------");
		stringValidator("John Smith");
		stringValidator(null);
		stringValidator("");
	}
	
	private static void ageValidator(int age) {
		if(age >18) {
			System.out.println("Your age is a valid age, You can Vote! ");
		}else {
			throw new RuntimeException("Your age is invalid");
		}
	}
	
	private static void stringValidator(String str) {
		if(str !=null && str.length()>0) {  //not an empty string
			System.out.println("it's a valid string");
			
		}else {
			try {
				throw new IOException("Not a Valid string!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
	
}
