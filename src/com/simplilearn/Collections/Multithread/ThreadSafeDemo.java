package com.simplilearn.Collections.Multithread;

class Counter{
	int count =0;
	//increase count
	// public void increasCount() {				// none synchronized method
	public synchronized void increasCount() { 	//synchronized method
		count++; // count = count+1;
		
	};
	
	//decrease count
	public void decreasCount() {
		count--; // count = count-1;
		
	};
}

public class ThreadSafeDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		Thread t1 = new Thread (()-> {
			for (int i=0; i< 1000; i++) {
				counter.increasCount();
			}
		});
		
		Thread t2 = new Thread (()-> {
			for (int i=0; i< 1000; i++) {
				counter.increasCount();
			}
		});
		
		Thread t3 = new Thread (()-> {
			for (int i=0; i< 1000; i++) {
				counter.increasCount();
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("The Count : "+counter.count);
	}

}
