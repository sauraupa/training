package com.cg.practise;

import java.util.Scanner;
public class Ques2_4 
{
	
	String g;
	String ln;
	String fn;
	public static void main(String[] args)
    {
		String phn = null;
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter frist Name:");
    	String fn=s.next();
    	System.out.println("Enter last Name:");
    	String ln=s.next();
    	System.out.println("Enter gender:");
    	String g=s.next();
    	Ques2_4 ob=new Ques2_4();
    	ob.number();
        Ques2_4Main ob1= new Ques2_4Main();
    	
		Ques2_4Main ob4 = new Ques2_4Main (fn, ln, g,phn);
        ob1.disp();
    	ob4.disp();
   	
    }
	public void number()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Phone Number:");
		String phn= s.next();
	}
	
}
