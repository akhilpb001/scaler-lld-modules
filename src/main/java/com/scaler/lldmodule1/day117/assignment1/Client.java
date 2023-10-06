package com.scaler.lldmodule1.day117.assignment1;

public class Client {

	public static void main(String[] args) {
		System.out.println("I am the main class");

		Adder adder = new Adder();
		ScalerThread thread1 = new ScalerThread(adder);
		thread1.start();

		Subtractor subtractor = new Subtractor();
		ScalerThread thread2 = new ScalerThread(subtractor);
		thread2.start();
	}
}
