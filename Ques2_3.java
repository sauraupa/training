package com.cg.practise2;





public class Ques2_3 
{
	   String firstname,lastname;
		String gender;
	
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		public Ques2_3()
		{
			//System.out.println("No pArameter");
		}
		
		public Ques2_3(String fn, String ln, String g) 
		{
			//System.out.println("parameterized");
			firstname=fn;
			lastname=ln;
			gender=g;
			
		}
		public void disp()
		{	
		System.out.println("FirstName - " +firstname+ "\nLastName - " +lastname+ "\nGender - " +
		gender);
		}
}
