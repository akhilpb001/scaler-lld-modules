package com.scaler.lldmodule1.day120.assignment2;

public class FooPrinter implements Runnable {
	private FooBar foobar;

	public FooPrinter(FooBar foobar) {
		this.foobar = foobar;
	}

	@Override
	public void run() {
		try {
			foobar.foo();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
