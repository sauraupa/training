package com.cg.practise;

import java.util.Scanner;



public class Ques2_1 
{
	public static void main(String[] args)
	{
		int i,age,weight,a;
		String fname,lname,gender;
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter First Name:");
		fname= ss.next();
		System.out.println("Enter Last Name:");
		lname= ss.next();
		System.out.println("Enter Gender:");
		gender= ss.next();
		System.out.println("Enter age:");
		age= ss.nextInt();
		System.out.println("Enter weight");
		weight= ss.nextInt();
		
		System.out.println("Personal Details:");
		System.out.println("_________");
		System.out.println("First Name:"+ fname);
		System.out.println("Last Name:"+lname);
		System.out.println("Gender:"+gender);
		System.out.println("Age:"+age);
		System.out.println("Weight"+weight);
	}
}
