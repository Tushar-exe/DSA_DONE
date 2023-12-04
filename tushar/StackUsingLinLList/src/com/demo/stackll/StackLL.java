package com.demo.stackll;

import com.demo.beans.Employee;


public class StackLL {
	
	
	Node top;
	class Node
	{
		Employee emp;
		Node next;
		
		public Node(int id,String g,String fn)
		{
			Employee ob=new Employee(id,g,fn);
			this.emp=ob;
			this.next=null;
			
		}
	}
	
	public StackLL()
	{
		top=null;
	}
	
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public void insertEmp(int id,String g,String fn)
	{   Node newNode=new Node(id, g, fn);
		
		if(top==null)
			{
				top=newNode;
			}
			
			else
			{
				newNode.next=top;
				top=newNode;
			}
			
			
		}
	
	
	public void display()
	{
		Node temp=top;
		
		if(top==null)
		{
			System.out.println("Stack is empty");
			return;
		}
		
		while(temp!=null)
		{
			System.out.println(temp.emp);
			temp=temp.next;
		}
		

	}


	public Employee removeEmp() {
		// TODO Auto-generated method stub
		if(top==null) return null;
		Node temp=top;
		top=top.next;
		temp.next=null;
		return temp.emp;
				
	}
	
	public void maledata()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return;
		}
		Node temp=top;
		while(temp!=null)
		{
			if(temp.emp.getGender().equals("Male"))
			{
				System.out.println(temp.emp);
			}
			temp=temp.next;
		}
	}
	
	
	public void femaledata()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return;
		}
		Node temp=top;
		while(temp!=null)
		{
			if(temp.emp.getGender().equals("Female"))
			{
				System.out.println(temp.emp);
			}
			temp=temp.next;
		}
	}
	
	public void printOrg()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return;
		}
		
		recurPrint(top);
	}


	private void recurPrint(Node top) {
		// TODO Auto-generated method stub
		
		if(top==null)
			return;
		recurPrint(top.next);
		System.out.println(top.emp);
		
	}
	
	public void emptyList()
	{
		if(top==null)
			return;
		top=top.next;
		emptyList();
	}

}
