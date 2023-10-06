package com.scaler.lldmodule1.day121.assignment4;

import java.util.TreeSet;

public class Client {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();

		// Adding element to TreeSet
		treeSet.add(40);
		treeSet.add(50);
		treeSet.add(30);
		treeSet.add(10);
		treeSet.add(20);

		// Print TreeSet
		System.out.println("TreeSet: " + treeSet);
		System.out.println("Just larger (ceiling) value of 23: " + getJustLarger(treeSet, 23));
		System.out.println("Just smaller (floor) value of 23: " + getJustSmaller(treeSet, 23));
	}

	public static Integer getJustLarger(TreeSet<Integer> treeSet, int data) {
		// write the code to return value equal to or just larger than data
		return treeSet.ceiling(data);
	}

	public static Integer getJustSmaller(TreeSet<Integer> treeSet, int data) {
		// write the code to return value equal to or just smaller than data
		return treeSet.floor(data);
	}
}
