package com.scaler.lldmodule1.leetcodezeroevenoddsemaphore;

public class EvenPrinter implements Runnable {
	private ZeroEvenOdd zeroEvenOdd;

	public EvenPrinter(ZeroEvenOdd zeroEvenOdd) {
		this.zeroEvenOdd = zeroEvenOdd;
	}

	@Override
	public void run() {
		try {
			this.zeroEvenOdd.even();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}