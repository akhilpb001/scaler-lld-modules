package com.scaler.lldmodule1.day120.assignment2;

// https://leetcode.com/problems/print-foobar-alternately/description/
public class Main {

	public static void main(String[] args) {
		FooBar foobar = new FooBar(5);

		Thread threadA = new Thread(new FooPrinter(foobar));
		Thread threadB = new Thread(new BarPrinter(foobar));

		threadA.start();
		threadB.start();
	}

}
