package com.selflearning.accessmodifiers;

public class PrivateAccessModifierTest {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		//private property access
		//System.out.println(account.balance); => // compile time error
		
		//public property access
		System.out.println("account id :"+ account.showId());
		System.out.println("---------------");
		account.showPropeties();
	}

}


class Account {
	
	//data member : properties
	private long id = 100001;
	private double balance =89954.33;
	private String username = "tom1234";
	private String password ="tom@1234";
	
	//private methods
	private double showBalance() {
		return balance;
	}
	public long showId() {
		return id;
	}
	public void showPropeties() {
		System.out.println("username :"+username); 
		System.out.println("Account Id :"+id);
		System.out.println("account Balance :"+balance);
	}
	
	//default constructor
	// Account (){}
	
	// private constructor ::NOTE > private constructor based class can not be instantiated.
	// private Account (){}
}