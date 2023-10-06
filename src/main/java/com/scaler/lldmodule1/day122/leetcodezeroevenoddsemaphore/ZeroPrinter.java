package com.scaler.lldmodule1.day122.leetcodezeroevenoddsemaphore;

public class ZeroPrinter implements Runnable {
	private ZeroEvenOdd zeroEvenOdd;

	public ZeroPrinter(ZeroEvenOdd zeroEvenOdd) {
		this.zeroEvenOdd = zeroEvenOdd;
	}

	@Override
	public void run() {
		try {
			this.zeroEvenOdd.zero();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
