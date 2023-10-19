package com.scaler.lldmodule1.helloworldprinter;

public class Main {

	public static void main(String[] args) {
		HelloWorldPrinter hwp = new HelloWorldPrinter();
		Thread thread = new Thread(hwp);
		thread.start();

		System.out.println("Hello World from main(): " + Thread.currentThread().getName());
	}

}
