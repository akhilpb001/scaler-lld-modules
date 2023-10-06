package com.scaler.lldmodule1.day116.assignment3;

public class Car implements Comparable<Car> {
	public int price;
	public int speed;

	public Car() {
	}

	public Car(int price, int speed) {
		this.price = price;
		this.speed = speed;
	}

	@Override
	public int compareTo(Car o) {
		return price - o.price;
	}
}
