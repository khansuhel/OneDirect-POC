package com.onedirect.poc.linkedStack;

public class Node {

	private int data;
	private Node next;

	public Node() {
		next = null;
		data = 0;
	}

	public Node(int d, Node n) {
		data = d;
		next = n;
	}

	/* Function to set link to next Node */
	public void setNext(Node n) {
		next = n;
	}

	/* Function to set data to current Node */
	public void setData(int d) {
		data = d;
	}

	/* Function to get link to next node */
	public Node getNext() {
		return next;
	}

	/* Function to get data from current Node */
	public int getData() {
		return data;
	}
}
