package com.cg.practise;

import java.util.Arrays;
import java.util.Scanner;

public class Ques7_1 
{
    public static void main(String[] args)
    {
    	int i;
    	Scanner s=new Scanner(System.in);
    	String[] arr=new String[5];
    	for(i=0;i<5;i++)
    	{
    		System.out.println("Enter Product name:");
    		arr[i]=s.next();
    	}
    	Arrays.sort(arr);
        for(i=0;i<5;i++)
        {
        	System.out.println(arr[i]);
        }
    }
}
