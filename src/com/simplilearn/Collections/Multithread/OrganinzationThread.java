package com.simplilearn.Collections.Multithread;

public class OrganinzationThread {
	//main Thread
	public static void main(String[] args) {
		// crate a new thread John
		John thread1 = new John();
		thread1.start();
		
		// crate a new thread Sam
		Sam thread2 = new Sam();
		thread2.start();
		
		// crate a new thread Azhar
		Azhar thread3 = new Azhar();
		thread3.start();
		
		

	}

}


class John extends Thread{
	
	@Override
	  public void run() {
			 // thread processing logic
		       System.out.println("John Thread is running...");
		    }
}

class Sam extends Thread{
	
	@Override
	 public void run() {
		 // thread processing logic
	       System.out.println("Sam Thread is running...");
	    }
	
}

class Azhar extends Thread{
	
	@Override
	 public void run() {
		 // thread processing logic
	       System.out.println("Azhar Thread is running...");
	    }
	
}
