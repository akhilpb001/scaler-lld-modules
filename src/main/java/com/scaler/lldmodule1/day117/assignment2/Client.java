package com.scaler.lldmodule1.day117.assignment2;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNum = scanner.nextInt();
		int secondNum = scanner.nextInt();

		Adder adder = new Adder(firstNum, secondNum);
		ScalerThread thread = new ScalerThread(adder);
		thread.start();

		scanner.close();
	}

}
