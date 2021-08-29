package com.selflearning.accessmodifiers.Bank;

public class BankLocker {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.email = "mak@223.com"; // assigning value;
		account.gender = "Male";
		
		System.out.println("Locker Bank Name :"+ account.bankName);
		/**
		 *  System.out.println("User Account Number :"+account.accNo); ::> protected access
		 *  System.out.println("User account Pin :"+account.accPin);	::> protected access
		 */
		System.out.println("User account email :"+ account.email);
		System.out.println("User account gender :"+ account.gender);
		account.showAccount();

	}

}

class Account {
	
	public String bankName ="Iron Bank";
	private long accNo =1000023;
	private int accPin =4523;
	protected String accType ="current";
	String email;
	String gender;
	
	public void showAccount() {
		System.out.println("Account Number :"+accNo);
		System.out.println("Account Pin :"+accPin);
	}
}


