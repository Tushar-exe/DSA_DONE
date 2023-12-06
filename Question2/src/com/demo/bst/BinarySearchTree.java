package com.demo.bst;

public class BinarySearchTree {
	
	private Node root;
	
	class Node
	{
		private int data;
		private Node left;
		private Node right;
		private Node next;
		
		public Node()
		{
			this.data=0;
			this.left=null;
			this.right=null;
		}
		
		public Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
			this.next=null;
			
		}
	}
	
	public BinarySearchTree()
	{
		root=null;
	}
	
	public  void generateBinary(int key)
	{
		root=insertData(root,key);
	}

	private Node insertData(Node root, int key) {
		
		Node newNode=new Node(key);
		
		if(root==null)
		{
		    root=newNode;
		    return root;
		}
		
		if(key<root.data)
		{
			root.left=insertData(root.left, key);
		}
		else
		{
			root.right=insertData(root.right, key);
		}
		return root;
		
	}
	
	public void preorder()
	{
		preorderTraversal(root);
		System.out.println("null");
	}
	

	public void preorderTraversal(Node root) {
		
		if(root!=null) {
			
		System.out.print(root.data+"->");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}
		
	}
	

	
	public boolean searcData(int data)
	{
		if(root==null)
		{
			return false;
		}
		
		//Node temp=root;
		
		while(root!=null)
		{
			if(root.data==data)
			{
				
				return true;
				
			}
			
			if(root.data<=data)
			{
				root=root.right;
			}
			else
			{
				root=root.left;
			}
		
			
		}
		return false;
	}


}
