package com.scaler.lldmodule1.day120.assignment2;

public class BarPrinter implements Runnable {
	private FooBar foobar;

	public BarPrinter(FooBar foobar) {
		this.foobar = foobar;
	}

	@Override
	public void run() {
		try {
			foobar.bar();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
