package com.cg.eis.bean;

import com.cg.eis.pl.Main;
import com.cg.eis.service.EmployeeService;

public class Employee extends Main
{
    int id;
    int salary;
    String name;
    String desg;
    char sch;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public char getSch() {
		return sch;
	}
	public void setSch(char sch) {
		this.sch = sch;
	}
	public String getFindInsScheme(String desg2, int salary2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
