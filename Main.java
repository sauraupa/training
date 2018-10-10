package com.cg.eis.pl;

import java.util.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Services;

public class Main 
{
	public static String name;
	public static String desg;
	public static int id;
	public static int salary;
	public static void main(String[] args)
	{
	
		Scanner s=new Scanner(System.in);
	   
	    	
	    System.out.println("Enter employee name:");
	    name= s.next();
	    System.out.println("Enter employee Id:");
	    id= s.nextInt();
	    System.out.println("Enter designation:");
	    desg= s.next();
	    System.out.println("Enter Salary:");
	    salary=s.nextInt();
	    
	    Employee a=new Employee();
	    a.setId(id);
	    a.setName(name);
	    a.setSalary(salary);
	    a.setDesg(desg);
	    
	    System.out.println("Name:"+a.getName());
	    System.out.println("Designation:"+a.getDesg());
	    System.out.println("Employee Id:"+a.getId());
	    System.out.println("Salary:"+a.getSalary());
	    Services b=new Services();
	    
	    System.out.println("Insurance Scheme:"+b.FindInsScheme(desg,salary));
	    
	}
	

	
}
