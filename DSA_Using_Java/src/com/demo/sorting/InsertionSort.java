package com.demo.sorting;


	

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void insertionSort(int []arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			
			int j=i-1;
			for(;j>=0 && arr[j]>key;j--)
			{
				arr[j+1]=arr[j];
					
               }
			arr[j+1]=key;

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

		insertionSort(arr);
		System.out.println("Sorted array is:");
		System.out.println(Arrays.toString(arr));
	}

}

