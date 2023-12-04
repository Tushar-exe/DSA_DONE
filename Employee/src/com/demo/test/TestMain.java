package com.demo.test;

import java.util.Scanner;

import com.demo.StackLL.StackLL;

public class TestMain {
	
	public static void main(String []args)
	{
		StackLL stl=new StackLL();
		Scanner scan=new Scanner(System.in);
		int ch=0;
		
		
		do {
			System.out.println("------------------------");
			System.out.println("|       Menu-Driven     |");
			System.out.println("------------------------");
			System.out.println("|  1. addData           |");
			System.out.println("|  2. removedata        |");
			System.out.println("|  3. display           |");
			System.out.println("|  4. MaleData          |");
			System.out.println("|  5. FemaleData        |");
			System.out.println("|  6. Recursive Print   |");
			System.out.println("|  7. EmptyList         |");
			System.out.println("------------------------");
		
			
			System.out.println("Enter you choice");
			ch=scan.nextInt();
			
			
			switch(ch)
			{
			case 1: stl.addData(1, "Tushar","Male");
			        stl.addData(2, "Jayesh","Male");
			        stl.addData(3, "Kiran","Female");
			        stl.addData(4, "Pratik","Male");
			        stl.addData(5, "Chitrani","Female");
			        break;
			        
			case 2: stl.removeData();
			        
			case 3: stl.display();
					break;
			case 4: stl.maleData();
					break;
			case 5: stl.femaleData();
					break;
			case 6: stl.recurFun();
					break;
			case 7: stl.emptyList();
					break;
		
			
			}
			
			
		}while(ch!=8);
	}
}
