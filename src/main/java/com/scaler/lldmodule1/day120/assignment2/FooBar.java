package com.scaler.lldmodule1.day120.assignment2;

import java.util.concurrent.Semaphore;

public class FooBar {
	private int n;
	private Semaphore fooSema, barSema;

	public FooBar(int n) {
		this.n = n;
		fooSema = new Semaphore(1);
		barSema = new Semaphore(0);
	}

	public void foo() throws InterruptedException {
		for (int i = 0; i < n; i++) {
			fooSema.acquire();
			System.out.print("foo");
			barSema.release();
		}
	}

	public void bar() throws InterruptedException {
		for (int i = 0; i < n; i++) {
			barSema.acquire();
			System.out.print("bar");
			fooSema.release();
		}
	}
}
