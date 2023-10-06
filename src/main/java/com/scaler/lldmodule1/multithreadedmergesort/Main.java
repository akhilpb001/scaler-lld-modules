package com.scaler.lldmodule1.multithreadedmergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<Integer> arrayToSort = List.of(8, 1, 2, 9, 6, 3, 7, 5);

		ExecutorService es = Executors.newCachedThreadPool();

		Sorter sorterTask = new Sorter(arrayToSort, es);

		Future<List<Integer>> sortedArrayFuture = es.submit(sorterTask);

		List<Integer> sortedArray = sortedArrayFuture.get();

		for (Integer in : sortedArray) {
			System.out.print(in + " ");
		}

		System.out.println();
	}

}
