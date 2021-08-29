package com.selflearning.methods.bank;

public class Test {

	public static void main(String[] args) {
		
		BankOperations operations = new BankOperations();
		Account account = new Account(100001, 5000, "Jhn Smith", "Iron Bank");
		
		operations.showBalance(account);
//		double remainingBal = operations.withdrawAmount(account, 3000);
//		System.out.println(remainingBal);
		
		operations.withdrawAmount(account, 1000);
		operations.showBalance(account);
		
		operations.depositAmount(account, 1000);
		operations.showBalance(account);
		
		operations.interestAmount(account, 5.5, 3);
		
	}
}
