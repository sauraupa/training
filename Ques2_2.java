package com.cg.practise;

import java.util.Scanner;

public class Ques2_2 
{
    public static void main(String[] args)
    {
    	int a;
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		a=sc.nextInt();
		if(a>0)
		System.out.println("Number is positive");
		else if(a<0)
		System.out.println("Number is negative");
		else
		System.out.println("Number is zero");
    }
}
