package com.demo.hashing;

public class SinglyLinkList {
	
	Node head;
	
	class Node
	{
		private int data;
		private Node next;
		
		public Node()
		{
			this.data=0;
			this.next=null;
			
		}
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public SinglyLinkList()
	{
		head=null;
	}
	
	
	public void addAtStart(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	
	public boolean searchdata(int data)
	{
	
			Node temp=head;
			while(temp!=null)
			{
				if(temp.data==data)
				{
					
					return true;
				}
				temp=temp.next;
			}
			
		
		return false;
	}
	
	public void display()
	{
		
		Node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		System.out.println();
	}
}
