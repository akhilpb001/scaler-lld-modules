package com.scaler.lldmodule1.addersubtractorsynchronizedmethod;

public class Value {
	private int value = 0;

	public int getValue() {
		return this.value;
	}

	public synchronized void incrementBy(int num) {
		this.value += num;
	}

	public synchronized void decrementBy(int num) {
		this.value -= num;
	}
}
