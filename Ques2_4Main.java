package com.cg.practise;


	public class Ques2_4Main 
	{
		   String firstname,lastname;
			String gender;
			String number;
		
			
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

			public String getNumber() {
				return number;
			}

			public void setNumber(String number) {
				this.number = number;
			}

			public Ques2_4Main()
			{
				//System.out.println("No pArameter");
			}
			
			public Ques2_4Main(String fn, String ln, String g, String phn) 
			{
				//System.out.println("parameterized");
				firstname=fn;
				lastname=ln;
				gender=g;
				number=phn;
				
			}
			public void disp()
			{
				System.out.println("FirstName - " +firstname+ "\nLastName - " +lastname+ "\nGender - " +
			gender+"\nNumber:"+number);
			}
	}

