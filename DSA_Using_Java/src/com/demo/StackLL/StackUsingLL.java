package com.demo.StackLL;

public class StackUsingLL {
	
	
	private Node top;
	
	class Node
	{
		private char data;
		private Node next;
		
		
		
		public Node(char data)
		{
			this.data=data;
			this.next=null;
		}
	}
	 
	public StackUsingLL()
	{
		top=null;
	}
	
	public boolean isEmpty()
	{
		if(top==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void pushData(char data)
	{ Node newnode = new Node(data);
    if (top != null) {
        newnode.next = top;
    }
    top = newnode;
}
	public char popData()
	{
		Node temp=top;
		
		if(temp==null)
		{
			System.out.println("Stack is underflow!!");
			return 0;
			
		}
		
			top=top.next;
			temp.next=null;
			return temp.data;
		
		
	}
	
private static boolean validate(String str) {
		
		StackUsingLL st=new StackUsingLL();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch=='(' || ch=='['|| ch=='{')
			{
				st.pushData(ch);
			}
			else
			{   
				if(ch==')'|| ch=='}'|| ch==']')
				{
				  if(!st.isEmpty())
				{
					char ch1=st.popData();
					
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
		
	
public static void main(String[] args) {
    String str = "(){}[]";
    System.out.println(str);

    boolean ans = validate(str);

    if (ans)
        System.out.println("String is balanced");
    else {
        System.out.println("String is not balanced");
    }
}

}


	
	
	
