package com.scaler.lldmodule1.day116.assignment2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		Iterator<Node> it = head.iterator();
		while (it.hasNext()) {
			System.out.print(it.next().data + " -> ");
		}

		System.out.print("null\n");

		for (Node node : head) {
			System.out.print(node.data + " -> ");
		}

		System.out.print("null\n");
	}

}
