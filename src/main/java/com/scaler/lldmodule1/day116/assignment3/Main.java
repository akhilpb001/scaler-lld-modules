package com.scaler.lldmodule1.day116.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();

		cars.add(new Car(1000, 100));
		cars.add(new Car(500, 100));
		cars.add(new Car(1500, 200));
		cars.add(new Car(2000, 300));
		cars.add(new Car(100, 50));

		Collections.sort(cars);

		for (Car car : cars) {
			System.out.println(car.price);
		}
	}

}
