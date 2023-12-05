package com.demo.CircularQueue;

import java.util.Scanner;

public class CircularQueue {

	private int front;
	private int rear;

	private int size;
	private int[] arr;

	public CircularQueue() {
		// TODO Auto-generated constructor stub
		this.front = -1;
		this.rear = -1;
		this.size = 5;
		arr = new int[5];
	}

	public CircularQueue(int size) {
		this.front = -1;
		this.rear = -1;
		this.size = size;
		arr = new int[size];
	}

	public boolean isEmpty() {
		if (front == -1 && front==rear)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (front == 0 && rear == (size - 1)) {
			return true;
		} else if ((rear + 1) % size == front) {
			return true;
		} else
			return false;
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (front == -1) {
				front = 0;
			}
			rear = (rear + 1) % size;
			arr[rear] = data;
		}
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty!!");
			return -1;
		} else {
			int x = arr[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			}
			else 
			front = (front + 1) % size;
			return x;
			
	}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CircularQueue cq = new CircularQueue();

		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		cq.enqueue(40);
		cq.enqueue(50);

		while(!cq.isEmpty())
		{
			System.out.println(cq.dequeue());
		}
		
		System.out.println(cq.dequeue());
	}

}
