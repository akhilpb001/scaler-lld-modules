package com.scaler.lldmodule1.numberprinterthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(10);

		for (int i = 1; i <= 100; i++) {
			NumberPrinter np = new NumberPrinter(i);
			threadPool.execute(np);
		}
	}
}
