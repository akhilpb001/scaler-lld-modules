package com.scaler.lldmodule1.day126.addersubtractorlamdas;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Value v = new Value();
		ExecutorService es = Executors.newCachedThreadPool();

		Callable<Void> adder = () -> {
			for (int i = 1; i <= 10000; ++i) {
				v.value += i;
			}
			return null;
		};

		Callable<Void> subtractor = () -> {
			for (int i = 1; i <= 10000; ++i) {
				v.value += i;
			}
			return null;
		};

		Future<Void> adderFuture = es.submit(adder);
		Future<Void> subtractorFuture = es.submit(subtractor);

		adderFuture.get();
		subtractorFuture.get();

		System.out.println(v.value);
	}

}
