package com.scaler.lldmodule1.leetcodezeroevenoddsemaphore;

public class OddPrinter implements Runnable {
	private ZeroEvenOdd zeroEvenOdd;

	public OddPrinter(ZeroEvenOdd zeroEvenOdd) {
		this.zeroEvenOdd = zeroEvenOdd;
	}

	@Override
	public void run() {
		try {
			this.zeroEvenOdd.odd();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}