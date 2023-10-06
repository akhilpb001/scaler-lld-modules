package com.scaler.lldmodule1.day120.assignment3;

import java.util.concurrent.Semaphore;

public class H2O {
	private Semaphore hydrogenSema, oxygenSema;
	private int currHydrogenSemaAcquired;

	public H2O() {
		hydrogenSema = new Semaphore(2);
		oxygenSema = new Semaphore(0);
		currHydrogenSemaAcquired = 0;
	}

	public void hydrogen() throws InterruptedException {
		hydrogenSema.acquire();
		currHydrogenSemaAcquired += 1;
		System.out.print("H");

		if (currHydrogenSemaAcquired == 2) {
			currHydrogenSemaAcquired = 0;
			oxygenSema.release();
		}
	}

	public void oxygen() throws InterruptedException {
		oxygenSema.acquire();
		System.out.print("O");
		hydrogenSema.release(2);
	}

}
