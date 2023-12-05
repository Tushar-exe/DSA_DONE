package com.demo.searching;

import java.util.Scanner;

public class BinarySearchRecursive {
	
	public static int binarySearch(int []nums,int l,int r,int target)
	{
		
		
		if(l<=r)
		{
			int mid=(l+r)/2;
			
			if(nums[mid]==target)
			{
				return mid;
			}
			
			if(nums[mid]>target)
			{
				return binarySearch(nums,l,mid-1,target);
			}
			else
			{
				return binarySearch(nums,mid+1,r,target);
			}
		}
		
		return -1;
		
	}
	
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		
		int n=scan.nextInt();
		
		int []nums=new int[n];
		
		System.out.println("Enter the elements of array");
		
		for(int i=0;i<n;i++)
		{
			nums[i]=scan.nextInt();
		}
		
		System.out.println("Enter the element u want to search");
		
		int target=scan.nextInt();
		
		int ans=binarySearch(nums,0,n-1,target);
		
		if(ans==-1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found at index"+ans);
		}
	}

}
