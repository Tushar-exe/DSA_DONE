package com.demo.StackLL;

import javax.xml.crypto.Data;

import com.demo.beans.Employee;

public class StackLL {
	
	private Node top;

	class Node
	{
		Employee data;
		Node next;
		
		public Node(int id ,String name,String gender)
		{
			
			data=new Employee(id,name,gender);
			this.next=null;
		}
	}
	
	public StackLL()
	{
		top=null;
	}
	
	
	public void addData(int id,String name,String gender)
	{
		Node newNode=new Node(id,name,gender);
		if(top==null)
		{
			top=newNode;
			return;
		}
		if(top!=null)
		{
			newNode.next=top;
			top=newNode;
		}
	}
	
	public void display()
	{
		if(top==null)
		{
			System.out.println("List is Empty");
			return;
		}
		Node temp=top;
		
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		
	}
	
	public Employee removeData()
	{
		if(top==null)
		{
			System.out.println("List is empty");
			return null;
		}
		
		Node temp=top;
		top=top.next;
		temp.next=null;
		return temp.data;
	}
	
	public void maleData()
	{
		if(top==null)
		{
			System.out.println("List is empty");
			return ;
		}
		
		Node temp=top;
		while(temp!=null)
		{
			if(temp.data.getGender().equalsIgnoreCase("Male"))
			{
				System.out.println(temp.data+" ");
			}
			temp=temp.next;
		}
		
	}


	public void femaleData() {
		if(top==null)
		{
			System.out.println("List is empty");
			return ;
		}
		
		Node temp=top;
		while(temp!=null)
		{
			if(temp.data.getGender().equalsIgnoreCase("Female"))
			{
				System.out.println(temp.data+" ");
			}
			temp=temp.next;
		}
		
	}
	
	public void recurFun()
	{
		if(top==null)
		{
			System.out.println("List is empty");
			return;
		}
			recursive(top);
		
	}


	private void recursive(Node top) {
		
		if(top==null)
			return;
		
		
		recursive(top.next);
		System.out.println(top.data);
		
	}
	
	public void emptyList()
	{
		if(top==null)
			return;
		top=top.next;
		emptyList();
	}


	
}
