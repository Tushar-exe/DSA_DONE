package com.demo.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void selectionSort(int []arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min_indx=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min_indx])
               {
            	  min_indx=j;
					
               }

			}
			int temp=arr[i];
			arr[i]=arr[min_indx];
			arr[min_indx]=temp;
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

		selectionSort(arr);
		System.out.println("Sorted array is:");
		System.out.println(Arrays.toString(arr));
	}

}
