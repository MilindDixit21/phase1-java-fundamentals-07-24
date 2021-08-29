package com.selflearning.accessmodifiers;

public class PublicAccessModifierDemo {
	
	public static void main(String[] args) {
		
				
		//create object
		Father father = new Father();
		System.out.println("Amount :"+father.amount);
		System.out.println("Park :"+father.park);
		//access methods
		System.out.println("Park (accesing method) :"+father.showPark());
		System.out.println("Amount (accesing method) :"+father.showAmount());
		
	}

}

class Father {
	//public variables
	public double amount = 8457.25d;
	public String park ="River Front";

	
	//public methods
	public double showAmount() {
		return amount;
	}	
	public String showPark() {
		return park;
	}
	
	//constructor which has the same name as the class
	public Father() {
		
	}
}