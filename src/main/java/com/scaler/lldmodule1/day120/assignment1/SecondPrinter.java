package com.scaler.lldmodule1.day120.assignment1;

public class SecondPrinter implements Runnable {
	private Foo foo;

	public SecondPrinter(Foo foo) {
		this.foo = foo;
	}

	@Override
	public void run() {
		try {
			foo.second();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
