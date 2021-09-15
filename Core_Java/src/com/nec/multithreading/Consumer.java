package com.nec.multithreading;

public class Consumer extends Thread {

	Company c;

	Consumer(Company c) {
		this.c = c;
	}

	public void run() {

		while (true) {
			try {
				this.c.consume_item();
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

		}
	}
}
