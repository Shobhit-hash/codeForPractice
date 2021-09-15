package com.nec.multithreading;

public class Producer extends Thread{
	Company c;
	public Producer(Company c) {
		this.c=c;
	}
	public void run() {
		int i=1;
		while(true) {
			
			try {
				this.c.produce_item(i);
				i++;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
