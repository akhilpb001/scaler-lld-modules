package com.scaler.lldmodule1.day117.assignment3;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			TableCreator table = new TableCreator(i);
			ScalerThread thread = new ScalerThread(table);
			thread.start();
		}

		scanner.close();
	}

}
