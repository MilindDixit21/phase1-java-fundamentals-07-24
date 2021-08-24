package com.simplilearn.excption.Hnadling;

import java.io.IOException;

public class ThrowEceptionDemo {
	//throws : throws is used to declare exception
	
	//calling method
	public static void main(String[] args) {
		
		try {
			ageValidator(21);
		} catch (IOException e) {
			//e.printStackTrace(e.getMessage());
			System.out.println(e.getMessage());
		}
	}
	// method declaration age validator
	public static void ageValidator(int age) throws IOException  {
		if (age>20) {
			System.out.println("valid age");
		}else {
			throw new IOException("Not a Valid age");
		}
	}

}
