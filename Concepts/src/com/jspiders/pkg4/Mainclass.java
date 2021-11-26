package com.jspiders.pkg4;

import com.jspiders.pkg5.Demo;

public class Mainclass extends Demo
{
	public static void main(String[] args)
	{
	   System.out.println("Program starts...");
	  
	   Demo d1 = new Demo();//create an Object of Superclass
	   
	   System.out.println("v1 : "+d1.v1);
	   d1.test1();
	   
	   Mainclass ref1 = new Mainclass();//create an Object of Subclass
	   
	   System.out.println("v2 : " + ref1.v2);
	   ref1.test2();
	  
	   System.out.println("Program ends...");
	}
}
