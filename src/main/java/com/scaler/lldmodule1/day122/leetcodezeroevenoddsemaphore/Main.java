package com.scaler.lldmodule1.day122.leetcodezeroevenoddsemaphore;

public class Main {

	public static void main(String[] args) {
		ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(5);

		ZeroPrinter zero = new ZeroPrinter(zeroEvenOdd);
		OddPrinter odd = new OddPrinter(zeroEvenOdd);
		EvenPrinter even = new EvenPrinter(zeroEvenOdd);

		Thread zeroThread = new Thread(zero);
		Thread oddThread = new Thread(odd);
		Thread evenThread = new Thread(even);

		zeroThread.start();
		oddThread.start();
		evenThread.start();
	}

}
