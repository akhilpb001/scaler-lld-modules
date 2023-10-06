package com.scaler.lldmodule1.day120.assignment1;

import java.util.concurrent.Semaphore;

public class Foo {
	private Semaphore firstSema, secondSema, thirdSema;

	public Foo() {
		firstSema = new Semaphore(1);
		secondSema = new Semaphore(0);
		thirdSema = new Semaphore(0);
	}

	public void first() throws InterruptedException {
		firstSema.acquire();
		System.out.print("first");
		secondSema.release();
	}

	public void second() throws InterruptedException {
		secondSema.acquire();
		System.out.print("second");
		thirdSema.release();
	}

	public void third() throws InterruptedException {
		thirdSema.acquire();
		System.out.print("third");
		firstSema.release();
	}
}
