package com.scaler.lldmodule1.day121.addersubtractorsynchronizedobject;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Value v = new Value();
		Adder adder = new Adder(v);
		Subtractor sub = new Subtractor(v);

		ExecutorService es = Executors.newCachedThreadPool();

		Future<Void> adderFuture = es.submit(adder);
		Future<Void> subFuture = es.submit(sub);

		adderFuture.get();
		subFuture.get();

		System.out.println(v.value);
	}

}
