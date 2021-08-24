package com.simplilearn.Collections.Multithread;

public class ThreadWithLambda {
	
	public static void main(String[] args ) {
		Thread thread1 = new Thread( () -> {
				       for(int i=0; i<5; i++) {
				    	   System.out.println("Thread A is running..");
				       }

		});
		Thread thread2 = new Thread( () -> {
		       for(int i=0; i<5; i++) {
		    	   System.out.println("Thread B is running..");
		       }

});
	}

}
