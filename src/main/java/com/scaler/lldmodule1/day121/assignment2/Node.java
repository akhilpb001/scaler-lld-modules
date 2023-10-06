package com.scaler.lldmodule1.day121.assignment2;

import java.util.Iterator;

public class Node implements Iterable<Integer> {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new NodeIterator(this);
	}
}

class NodeIterator implements Iterator<Integer> {
	private Node current;

	public NodeIterator(Node node) {
		current = node;
	}

	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public Integer next() {
		Node temp = current;
		current = current.next;
		return temp.data;
	}

}