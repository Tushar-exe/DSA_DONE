package com.demo.test;

import com.demo.beans.Employee;
import com.demo.stackll.StackLL;

public class TestMain {
	
	public static void main(String []args)
	{
	    StackLL stl=new StackLL();
	    
	    
	    stl.insertEmp(50,"Male","Tushar");
	    stl.insertEmp(51,"Female","T");
	    stl.insertEmp(53,"Female","Tar");
	    stl.insertEmp(56,"Male","ar");
	   stl.display();
   //System.out.println(stl.removeEmp());
	 
	   // stl.display();
	    System.out.println("\n");
	    
	 //   stl.maledata();
//	    stl.display();
	   
	    //stl.femaledata();
	   // stl.printOrg();
	    
	   // stl.emptyList();
	    
	    //stl.display();
}
}
