package com.scaler.lldmodule1.day121.assignment2;

public class Main {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		for (Integer node : head) {
			System.out.print(node + " -> ");
		}

		System.out.println("null");
	}

}
