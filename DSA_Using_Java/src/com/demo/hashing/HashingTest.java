package com.demo.hashing;


public class HashingTest {
	

	public static void main(String []args)
	{ 
		SinglyLinkList []starr=new SinglyLinkList[5];
		
		for(int i=0;i<starr.length;i++)
		{
			starr[i]=new SinglyLinkList();
		}
		
		int []arr= {23,56,10,56,100,56};
		
		for(int i=0;i<arr.length;i++)
		{
			int pos=arr[i]%starr.length;
			starr[pos].addAtStart(arr[i]);
		}
		
		for(int i=0;i<starr.length;i++)
		{
			starr[i].display();
		}
		
	
	int num=1;
	int pos=num%starr.length;
	
	boolean ans=starr[pos].searchdata(num);
	
	if(ans)
	{
		System.out.println("Element is present"+pos);
	}
	else
	{
		System.out.println("Element is not present");
	}
	
}
}

