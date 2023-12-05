package com.demo.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ModBubbleSort {
	
	public static void bubbleSort(int []arr)
	{ 
		boolean flag;
		for(int i=0;i<arr.length;i++)
		{	flag=false;
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			System.out.println("No of iterations done:");
			System.out.println(Arrays.toString(arr));
			
			if(!flag)
				return ;
		}
		
		
		
	}
	
	
	
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=scan.nextInt();
		
		int []arr=new int[n];
		
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		bubbleSort(arr);
		System.out.println("Sorted array is:");
		System.out.println(Arrays.toString(arr));
	}
	

}
