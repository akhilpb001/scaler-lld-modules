package com.scaler.lldmodule1.day118.assignment1;

public class Node {
	public int data;
	public Node left, right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
