package com.demo.test;
import java.util.Scanner;

import com.demo.beans.QueueLL;

public class TestMain {
	
	public static void main(String[]args)
	{
		int ch;
		Scanner scan=new Scanner(System.in);
		
		QueueLL obj=new QueueLL();
	
		
		do {
			System.out.println("------------------------------");
			System.out.println("|       MENU-DRIVEN          |");
			System.out.println("------------------------------");
			System.out.println("|    1. insert element in quue |");
			System.out.println("|    2.   remove               |");
			System.out.println("|    3.   print data           |");
			System.out.println("|    4.   isempty()            |");
			System.out.println("|    5.   isFull()             |");
			System.out.println("|    6.   exit                 |");
	        System.out.println("------------------------------");
			
			System.out.println("Enter your choice:");
			ch=scan.nextInt();
			
			switch(ch)
			{
			  	case 1: obj.enQueue("Ajay");
			  	        obj.enQueue("Vijay");
			  	      obj.enQueue("Aman");
			  	    obj.enQueue("Sonal");
			  	  obj.enQueue("Tushar");
			  	obj.enQueue("Amol");
			  	obj.enQueue("Patle");
			  	obj.enQueue("Anuj");
			  	obj.enQueue("Amay");
			  	obj.enQueue("Anup");
			  		break;
			  	case 2: String str=obj.deQueue();
			  			System.out.println("Data removed is:"+str+" ");
			  		break;
			  	case 3:obj.printData();
			  		break;
			  	case 4:boolean ans=obj.isEmpty();
			  			if(ans)
			  			{
			  				System.out.println("queue is empty");
			  			}
			  			else
			  				System.out.println("Queue is not empty");
			  		break;
			  	case 5:
			  		break;
			 
			  	case 6:
			  		System.out.println("Thank-You Visit Again !!!");
			  		break;
			  	default : System.out.println("Invalid Choice Please enter corrret choice");
			}
			
			
		}while(ch!=6);
	}
}





















































