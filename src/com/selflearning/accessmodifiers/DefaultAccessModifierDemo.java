package com.selflearning.accessmodifiers;

public class DefaultAccessModifierDemo {

	public static void main(String[] args) {
		
		Brother brother = new Brother();
		System.out.println("Money :"+brother.money);
		System.out.println("Shoes :"+brother.shoes);
		brother.showall();

	}

}

 class Brother {
	 //default properties
	 double money = 456123;
	 String shoes = "Nike";

	 //default method
	  void showall() {
		  System.out.println("Money :$"+money +" | Shoes :" +shoes);
	 }
	  
	  Brother(){}
 }
