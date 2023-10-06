package com.scaler.lldmodule1.day122.producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
	private int maxSize;
	private Queue<Object> items;

	public Store(int maxSize) {
		this.maxSize = maxSize;
		this.items = new ConcurrentLinkedQueue<>();
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void addItem() {
		this.items.add(new Object());
		System.out.println("Item Produced. New Count: " + this.items.size());
	}

	public void removeItem() {
		this.items.remove();
		System.out.println("Item Consumed. New Count: " + this.items.size());
	}

}
