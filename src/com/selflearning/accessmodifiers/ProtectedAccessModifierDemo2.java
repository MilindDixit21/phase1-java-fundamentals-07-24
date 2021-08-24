package com.selflearning.accessmodifiers;

import com.selflearning.accessmodifiers2.SuperHero;

public class ProtectedAccessModifierDemo2 extends SuperHero {
	
	public static void main(String[] args) {
		
		//SuperHero superhero = new SuperHero();
		//superhero.
		
		// NOTE:: protected properties or methods outside the package is accessible with inheritance.
		// using keyword :> extends and Class name
		
		ProtectedAccessModifierDemo2 accessM = new ProtectedAccessModifierDemo2();
		System.out.println("Number: "+accessM.number);
		System.out.println("Super Power: "+accessM.power);
		//System.out.println(accessM.password); :> //private property
		accessM.showUsername();
		
		System.out.println("------------------");
		System.out.println("Number: "+accessM.showNumber());
		System.out.println("Super Power: "+accessM.showPower());
	}
	
}
