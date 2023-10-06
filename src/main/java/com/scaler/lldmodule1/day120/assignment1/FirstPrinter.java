package com.scaler.lldmodule1.day120.assignment1;

public class FirstPrinter implements Runnable {
	private Foo foo;

	public FirstPrinter(Foo foo) {
		this.foo = foo;
	}

	@Override
	public void run() {
		try {
			foo.first();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
