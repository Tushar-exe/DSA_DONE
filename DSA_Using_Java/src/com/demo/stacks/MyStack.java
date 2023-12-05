package com.demo.stacks;

import java.util.Scanner;

public class MyStack {
	
	private int top;
	private int size;
	private char[]arr;
	
	public MyStack()
	{
		this.top=-1;
		this.size=5;
		arr=new char [5];
	}
	
	public MyStack(int size)
	{
		this.top=-1;
		this.size=size;
		arr=new char[size];
	}
	
	public boolean isEmpty()
	{
		if(top==-1) {
			System.out.println("Stack is Empty!!");
			return true; 
		}
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(top==size-1)
		{
			System.out.println("Stack is Full!!");
			return true;
		}
		else
			return false;
	}
	
	public void push(char data)
	{
		if(!isFull())
		{
				top++;
				arr[top]=data;
				
			}
		}
	
	
	public char pop()
	{
		if(!isEmpty())
		{
			char ch=arr[top];
			top--;
			return ch;
		}
		else
			return 0 ;
	
	}
	
	
private static boolean checkBalancedParenthesis(String str) {
		
	MyStack st=new MyStack(str.length());
	
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		
		if(ch=='(' || ch=='['|| ch=='{')
		{
			st.push(ch);
		}
		else
		{   
			if(ch==')'|| ch=='}'|| ch==']')
			{
			  if(!st.isEmpty())
			{
				char ch1=st.pop();
				
				if((ch==')' && ch1!='(')|| (ch=='}'&& ch1!='{')|| (ch==']' && ch1!='['))
				{
					return false;
				}
			}
		
				else
				
					return false;
			
			}
		}
		
		
	}
	if(st.isEmpty())
	return true;
	else
		return false;
}
	
//--------------------------------------------------------------------------------------------
	
	
	public static void main(String []args)
	{
		MyStack obj=new MyStack(20);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str=scan.next();
		System.out.println(str);
	
		boolean status=checkBalancedParenthesis(str);
		
		if(status)
		{
			System.out.println("String is balanced !!");
		}
		else {
			System.out.println("String is not balanced!!");

		
	}
	}
	
	
	
	
	  

}
