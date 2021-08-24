package com.selflearning.methods.bank;

public class BankOperations {
	
	public double showBalance(Account account) {
		System.out.println("The account " +account.accNo + " has Balance :"+account.balance);
		return account.balance;
	}
	
	public double withdrawAmount(Account account, double amount) {
		
		if(amount>0 || amount<account.balance) {
			account.balance -= amount;
			return account.balance;
		}else {
			System.out.println("Insufficient balance!");
			return 0;
		}
		
		
	}
	
	public double depositAmount(Account account, double amount) {
		
		if(amount>0) {
			account.balance += amount;
			return account.balance;
		}else {
			System.out.println("Deposit amount should not be zero");
			return 0;
		}
		
	}
	
	public double interestAmount(Account account, double interest, float duration) {
		if(account.balance>0 || duration>0 ) {
			double simpleInterest = (account.balance * interest * duration)/100 ;
			System.out.println("Your Account Balance :"+account.balance+" earns simple interest of $:"+simpleInterest+" in :"+duration+" years!");
			System.out.println("Rate of Ineterest :"+interest);
			return simpleInterest;
		}else {
			System.out.println("Deposit amount or duration should not be zero");
			return 0;
		}
		
	}

}
