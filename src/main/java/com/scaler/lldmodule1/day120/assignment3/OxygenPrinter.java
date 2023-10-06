package com.scaler.lldmodule1.day120.assignment3;

public class OxygenPrinter implements Runnable {
	private H2O h2o;

	public OxygenPrinter(H2O h2o) {
		this.h2o = h2o;
	}

	@Override
	public void run() {
		try {
			h2o.oxygen();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
