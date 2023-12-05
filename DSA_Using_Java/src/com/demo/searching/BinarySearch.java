package com.demo.searching;

import java.util.Scanner;


public class BinarySearch {
	
	
	public static int binarySearch(int []nums,int target)
	{
		int l=0;
		int r=nums.length-1;
		
		while(l<=r)
		{
			int mid=(l+r)/2;
			
			if(nums[mid]==target)
			{
				return mid;
			}
			
			else if(nums[mid]<target)
			{
				l=mid+1;
			}
			else
			{
				r=mid-1;
			}
		}
		return -1;
		
	}
	
	public static void main(String []args)
	{
		
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the size of the array");
		int n=scan.nextInt();
		
		int []nums=new int[n];
		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<n;i++)
		{
			nums[i]=scan.nextInt();
		}
		
		System.out.println("Enter the element u want to search");
		int target=scan.nextInt();
		
		int res=binarySearch(nums,target);
		
		if(res==-1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at index"+res);
		}
		
		
		
	}
	
	
	
	
	

}








