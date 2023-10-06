package com.scaler.lldmodule1.day122.producerconsumersemaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		Store store = new Store(5);
		Semaphore prodSema = new Semaphore(5);
		Semaphore consSema = new Semaphore(0);

		for (int i = 1; i <= 10; ++i) {
			es.submit(new Producer(store, prodSema, consSema));
		}

		for (int i = 1; i <= 20; ++i) {
			es.submit(new Consumer(store, prodSema, consSema));
		}
	}

}
