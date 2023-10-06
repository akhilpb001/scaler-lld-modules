package com.scaler.lldmodule1.day122.leetcodezeroevenoddsemaphore;

import java.util.concurrent.Semaphore;

public class ZeroEvenOdd {
	private int n;
	private Semaphore zeroSema = new Semaphore(1);
	private Semaphore evenSema = new Semaphore(0);
	private Semaphore oddSema = new Semaphore(0);

	public ZeroEvenOdd(int n) {
		this.n = n;
	}

	public void zero() throws InterruptedException {
		for (int i = 1; i <= n; ++i) {
			this.zeroSema.acquire();
			System.out.print(0);

			if (i % 2 == 0) {
				this.evenSema.release();
			} else {
				this.oddSema.release();
			}
		}
	}

	public void even() throws InterruptedException {
		for (int i = 2; i <= n; i += 2) {
			this.evenSema.acquire();
			System.out.print(i);
			this.zeroSema.release();
		}
	}

	public void odd() throws InterruptedException {
		for (int i = 1; i <= n; i += 2) {
			this.oddSema.acquire();
			System.out.print(i);
			this.zeroSema.release();
		}
	}
}
