package com.cg.eis.service;



public class Services implements EmployeeService
{
    
	@Override
	public String FindInsScheme(String desg, int salary) 
	{
		if(desg.equals("Manager") && salary>=40000)
		return ("Scheme A");
		
		else if(desg.equals("Programmer") && salary>=20000)
		return ("Scheme B");
		
		else if(desg.equals("System Associate") && salary>5000)
			return ("Scheme B");
		
		else if(desg.equals("Clerk") && salary<5000)
			return ("No Scheme");
		
		else
			return ("Wrong Choice");
	}
}
