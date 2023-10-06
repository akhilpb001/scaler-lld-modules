package com.scaler.lldmodule1.day118.assignment1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
	private Node root;
	private ExecutorService es;

	public TreeSizeCalculator(Node root, ExecutorService es) {
		this.root = root;
		this.es = es;
	}

	@Override
	public Integer call() throws Exception {
		if (root == null) {
			return 0;
		}

		TreeSizeCalculator leftTreeSizeCalcTask = new TreeSizeCalculator(root.left, es);
		TreeSizeCalculator rightTreeSizeCalcTask = new TreeSizeCalculator(root.right, es);

		Future<Integer> leftTreeSizeFuture = es.submit(leftTreeSizeCalcTask);
		Future<Integer> rightTreeSizeFuture = es.submit(rightTreeSizeCalcTask);

		Integer leftTreeSize = leftTreeSizeFuture.get();
		Integer rightTreeSize = rightTreeSizeFuture.get();

		return 1 + leftTreeSize + rightTreeSize;
	}

}
