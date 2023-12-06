package com.demo.beans;

public class QueueLL {
	static int count;
	

	
	private Node front;
	private Node rear;
	class Node
	{
		private String data;
		private Node next;
		
		public Node(String data)
		{
			this.data=data;
			next=null;
		}
		
	}
	
	public QueueLL() {
		this.front=null;
		this.rear=null;
	}
	
	
	public boolean isEmpty()
	{
		if(front==null && rear==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
//	
//	public boolean isFull()
//	{
//		if(rear==count)
//	}
	
	public void enQueue(String data)
	{
//		if(isFull())
//		{
//			System.out.println("Queue is empty data cannot be inserted");
//		}
		//Node newNode=new Node(data);
//		if(rear==null)
//		{
//			rear=newNode;
//			front=newNode;
//		}
//		
//		
//		rear=rear.next;
//		
//		rear=newNode;
//	
//		front=newNode;
		
		Node newNode=new Node(data);
		//Node temp=front;
		
		if(rear==null)
		{
			rear=newNode;
			front=newNode;
		}
		
		while(rear.next!=null)
		{
			rear=rear.next;
		}
		rear=newNode;
		
		System.out.println(rear.data);
		
	}
	
//	public static void calLen()
//	{
//	
//		Node temp=front;
//		while(temp.next!=null)
//		{
//			count++;
//		}
//	}
	
	public String deQueue()
	{
		if(isEmpty())
			System.out.println("Queue is empty data cannot be inserted");
		if(front==null)
		{
			return null;
		}
		Node temp=front;
		front=front.next;
		temp.next=null;
		return temp.data;
		
	}
	
	public void printData()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty !!");
		}
		
		Node temp=front;
		//Node temp=rear;
		while(front!=null)
		{
			System.out.println(front.data+"->");
			//temp=temp.next;
			
			
		}
	}

}
