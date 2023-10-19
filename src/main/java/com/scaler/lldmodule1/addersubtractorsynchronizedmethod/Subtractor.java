package com.scaler.lldmodule1.addersubtractorsynchronizedmethod;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
	private Value v;

	public Subtractor(Value v) {
		this.v = v;
	}

	@Override
	public Void call() throws Exception {
		for (int i = 1; i <= 10000; ++i) {
			this.v.decrementBy(i);
		}

		return null;
	}

}
