package com.scaler.lldmodule1.generics;

public class Dog extends Animal {
	private int height;

	public Dog(String name, int age, int height) {
		super(name, age);
		this.height = height;
	}

	@Override
	public String toString() {
		return "Dog [height=" + height + ", name=" + name + ", age=" + age + "]";
	}

}
