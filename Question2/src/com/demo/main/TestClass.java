package com.demo.main;


import java.util.Scanner;
import com.demo.bst.BinarySearchTree;

public class TestClass {
	
public static void main(String []args)
{
	BinarySearchTree bst=new BinarySearchTree();
	
	bst.generateBinary(45);
	bst.generateBinary(12);
	bst.generateBinary(34);
	bst.generateBinary(10);
	bst.generateBinary(51);
	bst.generateBinary(8);
	bst.generateBinary(52);
	bst.generateBinary(59);
	bst.generateBinary(50);
	
System.out.println("Preorder traversal:");
	bst.preorder();

	
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the element u want to search");
	
	int val=scan.nextInt();
	
	boolean ans=bst.searcData(val);
	
	if(ans)
	{
		System.out.println("Element is present");
	}
	else
	{
		System.out.println("Element is not present");
	}
	

}

}
