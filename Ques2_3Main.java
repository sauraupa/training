package com.cg.practise2;

import java.util.Scanner;

public class Ques2_3Main 
{
    public static void main(String[] args)
    {
    	
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter frist Name:");
    	String fn=s.next();
        System.err.println("Please enter a name.");
    	System.out.println("Enter last Name:");
    	String ln=s.next();
    	System.err.println("Please enter a name.");
    	System.out.println("Enter gender:");
    	String g=s.next();
    	
      
    	
    	Ques2_3 ob=new Ques2_3();
    	Ques2_3 ob1 = new Ques2_3(fn, ln, g);
        ob.disp();
    	ob1.disp();
    }
    
    
}
