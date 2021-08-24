package com.selflearning.methods;

public class NonStaticMethodsDemo {

	public static void main(String[] args) {
		
		// for non static methods > need to create instantiate object for every single time to access properties of that class.  ::> memory consumption issue.
		NonStaticMethodsDemo demo = new NonStaticMethodsDemo();
		demo.showMessage();
		demo.showAuthor("Tom");
		demo.displayDetails("auth@gmail.com", "a good author");

	}
	
	// user defined methods: 1. parameterized method 2. non-parameterized methods

	// non-parameterized method
	public void showMessage() {
		System.out.println(":: welcome to Java Methods ::");
	}
	
	// parameterized method
	public void showAuthor(String name) {
		System.out.println("Author name :"+name);
		
	}
	
	// two parameterized method
	public void displayDetails(String email, String description) {
		System.out.println("Author email :"+email + " |  Description :" +description);
	}
	

}
	
	

