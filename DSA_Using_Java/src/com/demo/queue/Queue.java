package com.demo.queue;

public class Queue {
	
	private int front;
	private int rear;
	private int []arr;
	private int size;
	
	public Queue()
	{
		this.front=-1;
		this.rear=-1;
		arr=new int[5];
		this.size=5;
	}
	
	public Queue(int size)
	{
		this.front=-1;
		this.rear=-1;
		this.size=size;
		arr=new int[size];
	}
	
	public boolean isEmpty()
	{
		if((front==-1 && rear==-1) || front>rear)
		{
			return true;
		}
		return false;
	}
	
	public boolean isFull()
	{
		if(rear==size-1)
		{
			return true;
		}
		return false;
	}
	
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else
		{
			rear++;
			arr[rear]=data;
		}
	}
	
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		else
		{
			if(front==-1)
				front=0;
			
			int x=arr[front];
			front++;
			return x;
		}
		
	}
	
	public static void main(String []args)
	{
		Queue q=new Queue(5);
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		while(!q.isEmpty())
		{
			System.out.println(q.dequeue());
		}
		
		
	}

}
