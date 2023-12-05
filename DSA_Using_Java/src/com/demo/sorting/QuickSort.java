package com.demo.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String []args)
	{
		int []arr= {1,3,2,4,6,5,7,9,8,10};
		int n=arr.length;
		
		quickSort(arr,0,n-1);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		
		if(start<end)
		{
			int p=partition(arr,start,end);
			quickSort(arr,start,p-1);
			quickSort(arr,p+1,end);
		}
		
	}

	private static int partition(int[] arr, int start, int end) {
		
		int i=start;
		int j=end;
		int pivot=start;
		
		while(i<j)
		{
		
		while(i<end && arr[i]<=arr[pivot])
		{
			i++;
		}
		while(j>pivot && arr[j]>arr[pivot])
		{
			j--;
		}
		if(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
	}
		int temp=arr[j];
		arr[j]=arr[pivot];
		arr[pivot]=temp;
		return j;
}
}
