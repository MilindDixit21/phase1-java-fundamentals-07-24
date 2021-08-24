package com.selflearning.accessmodifiers2;

public class SuperHero {
	
	protected int number = 911;
	protected String power = "Thunder";
	private String nickname ="Flassh";
	
	protected int showNumber() {
		return number;
	}
	protected String showPower() {
		return power;
	}
	public void showUsername() {
		System.out.println("Nickname: "+nickname);
	}
	//protected SuperHero() {}

}
