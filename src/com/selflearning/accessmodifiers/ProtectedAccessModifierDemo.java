package com.selflearning.accessmodifiers;

public class ProtectedAccessModifierDemo {

	public static void main(String[] args) {
		
		Hero hero = new Hero();
		
		// access protected property
		System.out.println("String :"+hero.power);
		hero.showPower();
		
		System.out.println("------------");
		//access public method
		hero.usePower();
		System.out.println("Public knows :"+hero.knowPower());

	}

}



