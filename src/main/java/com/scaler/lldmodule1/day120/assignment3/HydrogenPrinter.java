package com.scaler.lldmodule1.day120.assignment3;

public class HydrogenPrinter implements Runnable {
	private H2O h2o;

	public HydrogenPrinter(H2O h2o) {
		this.h2o = h2o;
	}

	@Override
	public void run() {
		try {
			h2o.hydrogen();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
