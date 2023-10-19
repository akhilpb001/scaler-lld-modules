package com.scaler.lldmodule1.producerconsumerwrong;

public class Producer implements Runnable {
	private Store store;

	public Producer(Store store) {
		this.store = store;
	}

	@Override
	public void run() {
		while (true) {
			if (store.getItems().size() < store.getMaxSize()) {
				store.addItem();
			}
		}
	}

}
