package com.nec.multithreading;

class UserThread extends Thread{
	public void run() {
		System.out.println("This is my userDefined Thread");
	}
	
}
public class ThreadOp {
public static void main(String[] args) {
	System.out.println("Programme started");
	int x=44+11;
	System.out.println("Sum IS:"+x);
	
	//Thread..
	Thread t=Thread.currentThread();
	String threadName = t.getName();
	System.out.println("Current Running Thread is"+threadName);
	
	//setName
	t.setName("Custom Thread");
	System.out.println(t.getName());
	
	try {
		Thread.sleep(5000);
	} catch (Exception e) {
	};
	System.out.println(t.getId());
	
	//user defined threads
	System.out.println("programme ended");
	UserThread userThread= new UserThread();
	userThread.start();
}
}
