package com.scaler.lldmodule1.day120.assignment1;

public class ThirdPrinter implements Runnable {
	private Foo foo;

	public ThirdPrinter(Foo foo) {
		this.foo = foo;
	}

	@Override
	public void run() {
		try {
			foo.third();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
