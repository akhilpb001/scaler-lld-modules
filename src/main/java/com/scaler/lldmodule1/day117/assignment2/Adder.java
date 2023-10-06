package com.scaler.lldmodule1.day117.assignment2;

public class Adder implements Runnable {
	private int firstNumber;
	private int secondNumber;

	public Adder(int firstNum, int secondNum) {
		firstNumber = firstNum;
		secondNumber = secondNum;
	}

	@Override
	public void run() {
		System.out.println(firstNumber + secondNumber);
	}

}
