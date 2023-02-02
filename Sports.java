package dxc;

import java.util.Scanner;

/*
 * Define a class Sports with the following descriptions:
Data members:
s_code of type long
s_name of type (String)
fees of type integer
duration of type integer
Member Functions:
i Constructor to assign initial values of s_code as 1001, s_name as “Cricket”, fees as 500, 
duration as 70.
ii. A function newSports() which allows user to enter s_code, s_name and duration. Also 
assign the values to fees as per the following conditions:
s_name			 Fees
Table Tennis 		2000
Swimming			 4000
Football 			3000
iii. A function displaySports() to display all the details.

 */
public class Sports {
	long scode;
	String sname;
	int fees;
	int duration;
	Sports()
	{
		scode=1001;
		sname="Cricket";
		fees=500;
		duration=70;
	}
	void newSports()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Type 1001 for Cricket \n Type 1002 for Table Tennis \n Type 1003 for Swimming \n Type 1004 for Football");
		scode=sc.nextLong();
		System.out.println("Enter Name");
		sname=sc.next();
		System.out.println("Enter Duration");
		duration=sc.nextInt();
		
	}
	void displaySports()
	{
		System.out.println("Code  "+scode+"\n"+" Name  "+sname+"\n "+"Duration  "+duration);
		if(scode==1002)
		{
			System.out.println("Fees=2000");
		}
		else if(scode==1003)
		{
			System.out.println("Fees=4000");
		}
		else if(scode==1004)
		{
			System.out.println("Fees=3000");
		}
		else if(scode==1001)
		{
			System.out.println("Fees=500");
		}
	}

	public static void main(String[] args) {
		Sports s=new Sports();
		s.newSports();
		s.displaySports();

	}

}
