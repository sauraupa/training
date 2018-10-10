

import org.apache.log4j.Logger;

import java.util.*;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.io.*;
import java.nio.Buffer;
import java.lang.String;
public class Lab4 
{
	static Logger Log = Logger.getLogger(Lab7.class.getName());
	
	public static void main(String[] args)
	{
		double dep=0, wd=0, bal=0;
		Lab4 ob=new Lab4();
		ob.initiate(args);
		
		ob.transaction(dep, wd, bal);
		
	}
	

	void initiate(String[] args)
	{
		double bal=0;
		Integer a;
		Scanner ss=new Scanner(System.in);
		Log.info("Enter Your Name:");
		String n=ss.next();
		
		Log.info("Enter Your Passport Number:");
		String p=ss.next();
		
		Log.info("Enter Amount:");
		a=ss.nextInt();
	    bal = bal + a;
		
		Log.info("Do you want to open an account:(Y/N)");
		Character c=ss.next().charAt(0);
		
		switch(c)
		{
		case('N'):
			Log.info("Thank You");
		break;
		case('Y'):
			Lab4 acc=new Lab4();
		    acc.Logic(n,p,a);
		    break;
		    default: Log.info("Wrong Input");
		}
	}
	void Logic(String n,String p,Integer a)
	{
		if(n.length()>20)
			Log.error("Long Name");
		else
		{
			if(p.length()!=7)
				Log.error("No. of digits should be 7");
			else
			{
				if(a<500)
					Log.error("Amount should be greater than 500");
					
					else
					{
						SecureRandom sr=new SecureRandom();
						Integer act= sr.nextInt(10000000);
						if(act/10000000<=0)
							act= act+10000000;
						Log.info("Account Successfully created   "+act);
					}
			}
		}
	}
	
	void transaction(double dep, double wd, double bal)
	{
		Log.info("Choose: 1. Deposit, 2. Withdrwal , 3.Balance"); 
		Scanner ss=new Scanner(System.in);
		int d= ss.nextInt();
	    
	    switch(d)
	    {
	    case 1:
	    {
	    	Log.info("Enter Account No.");
	    	Integer act=ss.nextInt();
	    	Log.info("Enter Amount:");
	        int a=ss.nextInt();
	        bal=bal+a;
	        Log.info("Transaction Processed");
	        Log.info("Balance:"+bal);
	        break;
	    }
	    case 2:
	    {
	    	Log.info("Enter Account No.");
	    	Integer act=ss.nextInt();
	    	Log.info("Enter Amount:");
	        int a=ss.nextInt();
	        bal=bal-a;
	        Log.info("Transaction Processed");
	        Log.info("Balance:"+bal);
	        break;
	    }
	    case 3:
	    {
	    	Log.info("Enter Account No.");
	    	Integer act=ss.nextInt();
	    	bal= bal + ss.nextInt();
	        Log.info("Balance:"+bal);
	        break;
	    }
	    }
	}
}
