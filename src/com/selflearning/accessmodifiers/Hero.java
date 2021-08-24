package com.selflearning.accessmodifiers;

public class Hero {
	// protected properties
	protected String power = "The Hammer";
	
	// protected method
	protected void showPower () {
		System.out.println("Thor has :"+power);
	}
	
	//public method
	public void usePower() {
		System.out.println("Throoooows :"+power);
	}
	
	public String knowPower() {
		return power;
	}
	
	// NOTE:: class outside the package can not be instantiated with protected constructor.
	// protected Hero() {}
}
