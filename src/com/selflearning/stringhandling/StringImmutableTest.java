package com.selflearning.stringhandling;

public class StringImmutableTest {

	public static void main(String[] args) {
		
		// in Java, string objects are immutable.
		//Immutable simply means unmodifiable or unchangeable values.
		
		String username = "John";
		
		//contact() -> update the string
		username.concat(" Snow");	// old name -> old string (John)
		System.out.println(username); 
		
		System.out.println("--------------");
		
		String response = username.concat(" Snow"); // new name -> new string (John Snow)
		System.out.println(response); 

	}

}
