package com.scaler.lldmodule1.day120.addersubtractormutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
	private Value v;
	private Lock lock;

	public Adder(Value v, Lock lock) {
		this.lock = lock;
		this.v = v;
	}

	@Override
	public Void call() throws Exception {
		for (int i = 1; i <= 10000; ++i) {
			this.lock.lock();
			this.v.value += i;
			this.lock.unlock();
		}

		return null;
	}

}
