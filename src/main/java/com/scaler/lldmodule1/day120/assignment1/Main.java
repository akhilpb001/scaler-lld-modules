package com.scaler.lldmodule1.day120.assignment1;

// https://leetcode.com/problems/print-in-order/description/
public class Main {

	public static void main(String[] args) {
		Foo foo = new Foo();

		FirstPrinter first = new FirstPrinter(foo);
		SecondPrinter second = new SecondPrinter(foo);
		ThirdPrinter third = new ThirdPrinter(foo);

		Thread threadA = new Thread(first);
		Thread threadB = new Thread(second);
		Thread threadC = new Thread(third);

		threadA.start();
		threadB.start();
		threadC.start();
	}

}
