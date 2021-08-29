package com.selflearning.methods.bank;

public class Account {
	// properties
		long accNo;
		double balance;
		String userName;
		String bankName;
	
	// constructor : default constructor can not instantiate properties
		Account(){ }
	
	// => overloading constructor started below...
		
	// one parameter constructor
	Account(long accNo){
		this.accNo = accNo;
	}
	
	// two parameterized constructor
	Account(long accNo, double balance){
		this.accNo = accNo;
		this.balance = balance;
	}
	
	// with all the properties to be instantiated 
	Account(long accNo, double balance, String userName, String bankName){
		this.accNo = accNo;
		this.balance = balance;
		this.userName = userName;
		this.bankName = bankName;
	}
	
}
