package com.scaler.lldmodule1.day126.lamdasandstreams;

public class Main {

	public static void main(String[] args) {
		// version 1
		SomethingDoer somethingDoer = new SomethingDoer();
		Thread t1 = new Thread(somethingDoer);
		t1.start();

		// version 2
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Do something2...");
			}
		});
		t2.start();

		// version 3
		Runnable r = () -> {
			System.out.println("Do something3...");
		};
		Thread t3 = new Thread(r);
		t3.start();

		// version 4
		Thread t4 = new Thread(() -> {
			System.out.println("Do something4...");
		});
		t4.start();

		// version 5
		new Thread(() -> {
			System.out.println("Do something5...");
		}).start();

	}

}
