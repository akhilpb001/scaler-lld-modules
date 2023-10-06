package com.scaler.lldmodule1.generics;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Pair<String, String> fullName = new Pair<>("Honey", "Akhil");
		System.out.println(fullName.getFirst() + " " + fullName.getSecond());

//		Pair p1 = new Pair<>("Akhil", 32); // raw data types, don't use this.
//		Object name = p1.getFirst();
//		Integer age = (Integer) p1.getSecond();
//		System.out.println(name + ", " + age);

		List<Animal> animals = List.of(new Animal("A1", 10), new Animal("A2", 5), new Animal("A3", 6));
		List<Dog> dogs = List.of(new Dog("D1", 5, 4), new Dog("D2", 10, 8), new Dog("D3", 4, 3));

		printAnimals(animals);
		printAnimals(dogs);
	}

	public static void printAnimals(List<? extends Animal> animals) {
		for (Animal animal : animals) {
			System.out.println(animal.toString());
		}
	}

}
