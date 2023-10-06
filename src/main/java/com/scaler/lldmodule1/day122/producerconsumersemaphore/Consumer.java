package com.scaler.lldmodule1.day122.producerconsumersemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
	private Store store;
	private Semaphore producerSemaphore;
	private Semaphore consumerSemaphore;

	public Consumer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
		this.producerSemaphore = producerSemaphore;
		this.consumerSemaphore = consumerSemaphore;
		this.store = store;
	}

	@Override
	public void run() {
		while (true) {
			try {
				consumerSemaphore.acquire();
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			store.removeItem();
			producerSemaphore.release();
		}
	}

}
