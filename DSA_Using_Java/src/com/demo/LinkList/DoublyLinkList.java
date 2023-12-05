package com.demo.LinkList;

public class DoublyLinkList {
	
	private Node head;
	
	
	class Node
	{
		private int data;
		private Node next;
		private Node prev;
		
		public Node()
		{
			this.data=data;
			this.next=null;
			this.prev=null;
			
		}
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	public DoublyLinkList()
	{
		head=null;
	}
		
		public void inserAtFirst(int data)
		{
			Node temp=new Node(data);
			if(head==null)
			{
				head=temp;
				
		  }
			else
			{
				temp.next=head;
				head.prev=temp;
				head=temp;
			}
	}
		
		public void AddByPosition(int pos,int data)
		{	
			Node temp=head;
			Node newNode=new Node(data);
			
			for(int i=0;i<pos-2;i++)
			{
				temp=temp.next;  
			}
				
			newNode.next=temp.next;
			temp.next.prev=newNode;
			temp.next=newNode;
			newNode.prev=temp;
			
		}
		
		
		
		
		public void addAtEnd(int data)
		{
			Node temp=head;
			Node newNode=new Node(70);
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
		}
		
		public void deleteFirst()
		{
			Node temp=head;
			
			if(head==null)
			{
				return;
			}
			else
			{
				head=head.next;
				head.prev=null;
				temp.next=null;
				temp=null;
				
			}
		}
		
		public void deleteByPos(int pos)
		{
			if(pos<1)
			{
				System.out.println("Position is invalid");
				return;
			}
			if(pos==1)
			{
				deleteFirst();
				return; 
			}
			Node temp=head;
			int count=1;
			boolean flag = false;
			while(temp.next!=null)
			{
				if(count==pos-1)
				{
					
					flag=true;
					break;
				}
				temp = temp.next;
				
				count++;
			}
			

			if(flag==false)
			{
				System.out.println("Position is Invalid!");
				return;
			}
			
			 if(temp.next!=null&&temp.next.next!=null)
			{

				
				temp=temp.next.next;
				temp.next.prev=temp;
			}	
			else {
				temp.next=null;
			}
			}
	
		
		
		
		
		public void display()
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println("null");
		}
		
		
		
		
		
		
		public static void main(String []args)
		{
			DoublyLinkList dl=new DoublyLinkList();
			dl.inserAtFirst(10);
			dl.inserAtFirst(20);
			dl.inserAtFirst(30);
			dl.inserAtFirst(40);
			dl.inserAtFirst(50);
			dl.AddByPosition(3, 25);
			
			dl.addAtEnd(70);
			
			//dl.deleteFirst();
			//dl.deleteFirst();
			dl.display();
			
			dl.deleteByPos(3);
			dl.addAtEnd(70);
			
		
			
			dl.deleteByPos(3);
			
			
			dl.display();
			
		}

}
