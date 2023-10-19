package com.scaler.lldmodule1.producerconsumerwrong;

import java.util.ArrayList;
import java.util.List;

public class Store {
	private int maxSize;
	private List<Object> items;

	public Store(int maxSize) {
		this.maxSize = maxSize;
		this.items = new ArrayList<>();
	}

	public int getMaxSize() {
		return maxSize;
	}

	public List<Object> getItems() {
		return items;
	}

	public void addItem() {
		this.items.add(null);
		System.out.println("Item Produced. New Count: " + this.getItems().size());
	}

	public void removeItem() {
		this.items.remove(this.getItems().size() - 1);
		System.out.println("Item Consumed. New Count: " + this.getItems().size());
	}

}
