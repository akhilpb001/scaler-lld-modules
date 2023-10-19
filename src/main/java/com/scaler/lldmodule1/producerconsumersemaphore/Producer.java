package com.scaler.lldmodule1.producerconsumersemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
	private Store store;
	private Semaphore producerSemaphore;
	private Semaphore consumerSemaphore;

	public Producer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
		this.producerSemaphore = producerSemaphore;
		this.consumerSemaphore = consumerSemaphore;
		this.store = store;
	}

	@Override
	public void run() {
		while (true) {
			try {
				producerSemaphore.acquire();
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			store.addItem();
			consumerSemaphore.release();
		}
	}

}
