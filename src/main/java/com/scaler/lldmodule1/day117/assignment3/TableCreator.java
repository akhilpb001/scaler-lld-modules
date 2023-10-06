package com.scaler.lldmodule1.day117.assignment3;

public class TableCreator implements Runnable {
	private int n;

	public TableCreator(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " times " + i + " is " + (n * i));
		}
	}

}
