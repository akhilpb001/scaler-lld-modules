package com.scaler.lldmodule1.multithreadedmergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
	private List<Integer> arrayToSort;
	private ExecutorService es;

	public Sorter(List<Integer> arrayToSort, ExecutorService es) {
		this.arrayToSort = arrayToSort;
		this.es = es;
	}

	@Override
	public List<Integer> call() throws Exception {
		if (arrayToSort.size() <= 1) {
			return arrayToSort;
		}

		int size = arrayToSort.size();
		int mid = size / 2;

		List<Integer> leftArrayToSort = new ArrayList<>();
		List<Integer> rightArrayToSort = new ArrayList<>();

		for (int i = 0; i < mid; i++) {
			leftArrayToSort.add(arrayToSort.get(i));
		}

		for (int i = mid; i < size; i++) {
			rightArrayToSort.add(arrayToSort.get(i));
		}

		Sorter leftArraySorterTask = new Sorter(leftArrayToSort, es);
		Sorter rightArraySorterTask = new Sorter(rightArrayToSort, es);

		Future<List<Integer>> sortedLeftArrayFuture = es.submit(leftArraySorterTask);
		Future<List<Integer>> sortedRightArrayFuture = es.submit(rightArraySorterTask);

		List<Integer> sortedLeftArray = sortedLeftArrayFuture.get();
		List<Integer> sortedRightArray = sortedRightArrayFuture.get();

		List<Integer> sortedArray = new ArrayList<>();

		int i = 0, j = 0;

		while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
			if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
				sortedArray.add(sortedLeftArray.get(i));
				i += 1;
			} else {
				sortedArray.add(sortedRightArray.get(j));
				j += 1;
			}
		}

		while (i < sortedLeftArray.size()) {
			sortedArray.add(sortedLeftArray.get(i));
			i += 1;
		}

		while (j < sortedRightArray.size()) {
			sortedArray.add(sortedRightArray.get(j));
			j += 1;
		}

		return sortedArray;
	}

}
