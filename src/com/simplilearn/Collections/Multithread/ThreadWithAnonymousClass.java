package com.simplilearn.Collections.Multithread;

public class ThreadWithAnonymousClass {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			  public void run() {
					 // thread processing logic
				       for(int i=0; i<5; i++) {
				    	   System.out.println("Thread ABC is running..");
				       }

				    }

		});
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			  public void run() {
					 // thread processing logic
				       for(int i=0; i<5; i++) {
				    	   System.out.println("Thread XYZ is running..");
				       }

				    }

		});
		thread2.start();

	}
}
