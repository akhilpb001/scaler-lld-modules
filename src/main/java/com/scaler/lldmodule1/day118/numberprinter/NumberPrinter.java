package com.scaler.lldmodule1.day118.numberprinter;

public class NumberPrinter implements Runnable {
	private int numToPrint;

	public NumberPrinter(int numToPrint) {
		this.numToPrint = numToPrint;
	}

	@Override
	public void run() {
		System.out.println(numToPrint + " printed by : " + Thread.currentThread().getName());
	}

}
