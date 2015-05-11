package com.nifrasismail.Stack;

public class MyStack {
	private int size;
	private int[] StackHolder;
	private int top;

	public MyStack(int size) {
		this.size = size;
		StackHolder = new int[size];
		top = -1;
	}

	public void push(int element) {
		if (!isFull()) {
			top++;
			StackHolder[top] = element;
		}
	}

	public int peek() {
		return StackHolder[top];
	}

	public int pop() {
		return StackHolder[top--];
	}

	public Boolean isEmpty() {
		return (top == -1);
	}

	public Boolean isFull() {
		return (top == size - 1);
	}

}
