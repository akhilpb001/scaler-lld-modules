package com.scaler.lldmodule1.day126.streams;

import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> l1 = List.of(1, 2, 3, 4, 5);

		Stream<Integer> st1 = l1.stream();
		Stream<Integer> st2 = l1.stream();

		st1.forEach(System.out::println);

		st2.forEach((elem) -> {
			System.out.println(elem * 2);
		});

		l1.stream().forEach(System.out::println);

		List<Integer> l2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		l2.stream().filter((elem) -> elem % 2 == 0).forEach((elem) -> System.out.println(elem));

		l2.stream().map((elem) -> elem * 3).filter((elem) -> elem < 10).forEach((elem) -> System.out.println(elem));
	}

}
