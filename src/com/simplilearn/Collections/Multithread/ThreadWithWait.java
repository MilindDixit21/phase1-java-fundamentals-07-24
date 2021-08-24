package com.simplilearn.Collections.Multithread;


class Customer{
	double balance = 1000.0;
	
	synchronized void deposit(double amount) {
		System.out.println("Going to deposite ..");
		balance += amount; // balance = balance+amount;
		System.out.println("Deposite completed! & new balance: " +balance);
		
		notify();
		
		
	}
	synchronized void withdraw(double amount) {
		if(balance < amount) {
			System.out.println("Insufficient Fund!");
			try {
				wait(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
		balance-=amount;
		System.out.println("withdraw completed & new balance is "+balance);
		}
	}
	
	synchronized void showBalance() {
		System.out.println("Account Balance :"+balance);
	}
}

public class ThreadWithWait {

	public static void main(String[] args) throws InterruptedException {
		Customer customer = new  Customer();
		
		//create a thread for bank operation
		Thread t1 = new Thread (()-> {
			customer.withdraw(3000);
		});
		Thread t2 = new Thread (()-> {
			customer.showBalance();
		});
		Thread t3 = new Thread (()-> {
			customer.deposit(50000);
		});
		
		t1.start();
		t2.start();
		t3.start();

		
	}
}
