package com.scaler.lldmodule1.day120.assignment3;

// https://leetcode.com/problems/building-h2o/description/
public class Main {

	public static void main(String[] args) {
		int molecules = 2;
		H2O h2o = new H2O();

		for (int i = 1; i <= molecules; i++) {
			Thread thread = new Thread(new OxygenPrinter(h2o));
			thread.start();
		}

		for (int i = 1; i <= 2 * molecules; i++) {
			Thread thread = new Thread(new HydrogenPrinter(h2o));
			thread.start();
		}
	}

}
