package com.demo.sorting;

import java.util.Arrays;

public class MergeSort {
////	
	public static void main(String []args)
	{
		int []nums= {1,3,5,2,6,8,10,9,4,7};
		int n=nums.length;
		
//		mergeSort(nums,0,n-1);
//		
//		System.out.println(Arrays.toString(nums));
//	}
//
//	private static void mergeSort(int[] nums,int l,int r) {
//		
//		if(l<r)
//		{
//			int mid=l+(r-l)/2;
//			mergeSort(nums,l,mid);
//			mergeSort(nums,mid+1,r);
//			merge(nums,l,mid,r);
//		}
//		
//	}
//
//	private static void merge(int[] nums, int l, int mid, int r) {
//		
//		int i,j,k;
//		
//		int n1=mid-l+1;
//		int n2=r-mid;
//		
//		int []leftarr=new int[n1];
//		int []rightarr=new int[n2];
//		for( i=0;i<n1;i++)
//		{
//			leftarr[i]=nums[l+i];
//		}
//		
//		for( i=0;i<n2;i++)
//		{
//			rightarr[i]=nums[mid+1+i];
//		}
//		i=0;
//		j=0;
//		k=l;
//		
//		
//		while(i<n1 && j<n2)
//		{
//			if(leftarr[i]>=rightarr[j])
//			{
//				nums[k]=rightarr[j];
//				k++;
//				j++;
//			
//			}
//			else
//			{
//				nums[k]=leftarr[i];
//				k++;
//				i++;
//			}
//		}
//		
//		while(i<n1)
//		{
//			nums[k]=leftarr[i];
//			i++;
//			k++;
//		}
//		while(j<n2)
//		{
//			nums[k]=rightarr[j];
//			k++;
//			j++;
//		}
//	
//		
//	}
//		
		mergesort(nums,0,n-1);
		System.out.println("Sorted array is");
		System.out.println(Arrays.toString(nums));
		
		

}

private static void mergesort(int[] nums, int l, int r) {
	
	if(l<r)
	{
		int mid= (l+r)/2;
		mergesort(nums,l,mid);
		mergesort(nums,mid+1,r);
		merge(nums,l,mid,r);
	}
}

private static void merge(int[] nums, int l, int mid, int r) {
	
	int n1=mid-l+1;
	int n2=r-mid;
	
	int []leftarr=new int [n1];
	int []rightarr=new int[n2];
	
	int i,j,k;
	
	for(i=0;i<n1;i++)
	{
		leftarr[i]=nums[l+i];
	}
	
	for(j=0;j<n2;j++)
	{
		rightarr[j]=nums[mid+1+j];
	}
	i=0;j=0;
	k=l;
	while(i<n1 && j<n2)
	{
		if(leftarr[i]>=rightarr[j])
		{
			nums[k]=rightarr[j];
			j++;
			k++;
			
		}
		else
		{
			nums[k]=leftarr[i];
			i++;
			k++;
		}
	}
	
	while(i<n1)
	{
		nums[k]=leftarr[i];
		i++;
		k++;
	}
	
	while(j<n2)
	{
		nums[k]=rightarr[j];
		j++;
		k++;
	}
}
}
