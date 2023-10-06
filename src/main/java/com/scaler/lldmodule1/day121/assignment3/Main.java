package com.scaler.lldmodule1.day121.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car(10, 1000));
		cars.add(new Car(8, 800));
		cars.add(new Car(15, 1200));
		cars.add(new Car(5, 800));
		cars.add(new Car(20, 2000));

		Collections.sort(cars);

		for (Car car : cars) {
			System.out.println(car);
		}
	}

}
