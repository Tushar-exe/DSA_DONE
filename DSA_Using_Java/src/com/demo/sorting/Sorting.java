package com.demo.sorting;

import java.util.Arrays;

public class Sorting {
	

	public static void insertionSort(int []arr)
	{
		
		
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			
			int j=i-1;
			for(;j>=0&& arr[j]>key;j--)
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=key;
		}
	}
	
	public static void bubbleSort(int []arr)
	{	boolean flag;
		for(int i=0;i<arr.length;i++)
		{	flag=false;
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				flag=true;
				
			}
			if(!flag)
			return;
			System.out.println("iteration done:"+Arrays.toString(arr));
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String []args)
	{
		int []arr= {90,80,70,60,50,40,30,20,10};
		//insertionSort(arr);
		
		bubbleSort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
	}
}
