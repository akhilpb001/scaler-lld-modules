package com.scaler.lldmodule1.day121.assignment1;

public class Main {

	public static void main(String[] args) {
		Point point = new Point(1, 2);
		Point point2 = new Point(1, 3);

		System.out.println(point.equals(point));
		System.out.println(point.equals(null));
		System.out.println(point.equals(point2));
	}

}
