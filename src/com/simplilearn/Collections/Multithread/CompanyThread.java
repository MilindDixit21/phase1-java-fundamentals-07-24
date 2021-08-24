package com.simplilearn.Collections.Multithread;

public class CompanyThread {

	public static void main(String[] args) {
		
		// crate a new thread 
				Bob bob = new Bob(); 
				Thread thread1 = new Thread(bob);
				thread1.start();
				
		// crate a new thread 
				Mark mark = new Mark(); 
				Thread thread2 = new Thread(mark);
				thread2.start();	
				
				
	}

}
class Work{
	public void updateWork() {
		System.out.println("Update Work!");
		
	}
}

class Bob extends Work implements Runnable{
	
	@Override
	  public void run() {
			 // thread processing logic
		       System.out.println("Running Bob...");

		    }
}

class Mark extends Work implements Runnable{
	
	@Override
	  public void run() {
			 // thread processing logic
		       System.out.println("Running Mark..");
		    }
}