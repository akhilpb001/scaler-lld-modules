package com.scaler.lldmodule1.day118.assignment1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService threadPool = Executors.newCachedThreadPool();
		Node root = new Node(1, new Node(2), new Node(3));

		TreeSizeCalculator treeSizeCalcTask = new TreeSizeCalculator(root, threadPool);
		Future<Integer> treeSizeFuture = threadPool.submit(treeSizeCalcTask);
		Integer treeSize = treeSizeFuture.get();

		System.out.println("BinaryTreeSize: " + treeSize);
	}

}
