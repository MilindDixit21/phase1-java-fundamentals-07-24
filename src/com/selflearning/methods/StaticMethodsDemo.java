package com.selflearning.methods;

public class StaticMethodsDemo {

	public static void main(String[] args) {
		
		// static methods - do not have to create object - one time memory allocation (saving memory)
		StaticMethodsDemo.showMessages();
		StaticMethodsDemo.showLuckyNumber(251);
		StaticMethodsDemo.showDetails("New Jursey",03526);

	}
	
	// user defined methods : 1. parameterized 2. non-parameterized methods
	
	// non-parameterized static method
	
	public static void showMessages() {
		System.out.println(":: Welcome to Static Methods");
	}
	
	// one parameterized static method
	
	public static void showLuckyNumber(int number) {
		System.out.println("house number : "+number);
	}
	
	// two parameterized static method
	public static void showDetails(String name, int accId) {
		System.out.println("State : "+name +", ZIP : "+accId );
	}

}
