package com.jspiders.pkg5;

public class Sample
{
	public static void main(String[] args)
	{
		System.out.println("Program starts...");

		Demo d1 = new Demo();

		System.out.println("v1 : " + d1.v1);
		d1.test1();
		
		System.out.println("v2 : " + d1.v2);
		d1.test2();
		
		System.out.println("v3 : " + d1.v3);
		d1.test3();
		
		
		System.out.println("Program ends...");
	}
}
