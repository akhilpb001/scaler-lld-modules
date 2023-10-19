package com.scaler.lldmodule1.addersubtractormutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Value v = new Value();
		Lock lock = new ReentrantLock();

		Adder adder = new Adder(v, lock);
		Subtractor sub = new Subtractor(v, lock);

		ExecutorService es = Executors.newCachedThreadPool();

		Future<Void> adderFuture = es.submit(adder);
		Future<Void> subFuture = es.submit(sub);

		adderFuture.get();
		subFuture.get();

		System.out.println(v.value);
	}

}
