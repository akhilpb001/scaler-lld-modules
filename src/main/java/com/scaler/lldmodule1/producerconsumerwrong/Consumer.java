package com.scaler.lldmodule1.producerconsumerwrong;

public class Consumer implements Runnable {
	private Store store;

	public Consumer(Store store) {
		this.store = store;
	}

	@Override
	public void run() {
		while (true) {
			if (store.getItems().size() > 0) {
				store.removeItem();
			}
		}
	}

}
