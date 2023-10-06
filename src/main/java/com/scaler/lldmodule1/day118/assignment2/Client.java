package com.scaler.lldmodule1.day118.assignment2;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();

		ExecutorService threadPool = Executors.newCachedThreadPool();
		ArrayCreator arrCreatorTask = new ArrayCreator(num);

		Future<List<Integer>> arrCreatorFuture = threadPool.submit(arrCreatorTask);
		List<Integer> arrList = arrCreatorFuture.get();
		System.out.println(arrList);
	}

}
