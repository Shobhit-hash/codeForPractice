package com.nec.multithreading;

public class CompanyMainClass {

	public static void main(String[] args) {
		Company company= new Company();
		Producer producer= new Producer(company);
		Consumer consumer= new Consumer(company);
		
		producer.start();
		consumer.start();
	}
}
 