package com.jspiders.pkg5;

public class Demo
{
    public    int    v1 = 10;
    protected double v2 = 8.12;
              long   v3 = 91219319391l;
    private   String v4 = "jspiders";
    
    public void test1()
    {
    	System.out.println("this is public-test1() of Demo");
    }
    
    protected void test2()
    {
    	System.out.println("this is protected-test2() of Demo");
    	System.out.println(v4);
    }
    
    void test3()
    {
    	System.out.println("this is pkg-level-test3() of Demo");
    	test4();
    }
    
    private void test4()
    {
    	System.out.println("this is private-test4() of Demo");
    }
    
    
}
