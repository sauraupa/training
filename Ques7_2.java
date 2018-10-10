package com.cg.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ques7_2 
{
    public static void main(String[] args)
    { int i,j;
    	Scanner s=new Scanner(System.in);
         ArrayList a=new ArrayList();	
         System.out.println("Enter Number of Products");
         j= s.nextInt();
         for(i=0;i<j;i++)
         {
        	 System.out.println("Enter Product name:");
             a.add(s.next()); 
         }  
         Collections.sort(a);
         System.out.println(a);   
    }
}
