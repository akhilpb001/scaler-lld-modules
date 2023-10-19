package com.scaler.lldmodule1.producerconsumerwrong;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		Store store = new Store(5);

		for (int i = 1; i <= 10; ++i) {
			es.submit(new Producer(store));
		}

		for (int i = 1; i <= 20; ++i) {
			es.submit(new Consumer(store));
		}
	}

}
