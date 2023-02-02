package dxc;

import java.util.Scanner;

/*
 * Given below is a hypothetical table showing rates of Income Tax for male citizens below the age of 65 years :

Taxable Income (TI) in Rs.	Income Tax in Rs.
Does not exceed Rs. 1,60,000	Nil
Is greater than Rs. 1,60,000 and less than or equal to Rs. 5,00,000	(TI—1,60,000) × 10%
Is greater than Rs. 5,00,000 and less than or equal to Rs. 8,00,000	[(TI—5,00,000 × 20%] + 34,000
Is greater than Rs. 8,00,000	[(TI—8,00,000 × 30%] + 94,000
Write a program to input the age, gender (male or female) and Taxable Income of a person.
If the age is more than 65 years or the gender is female, display “wrong category”.
If the age is less than or equal to 65 years and the gender is male, compute and display the Income Tax payable as per the table given above. [15]
 */
class Tax
{
	int age;
	String gender,name;
	double income;
	double tax;
	void getdetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.next();
		System.out.println("Enter your age");
		age=sc.nextInt();
		System.out.println("Enter your Gender");
		gender=sc.next();
		System.out.println("Enter your Income");
		income=sc.nextDouble();
		
	}
	void showDetails()
	{
		System.out.println("Name    :"+name);
		System.out.println("Age     :"+age);
		System.out.println("Gender  :"+gender);
		System.out.println("Income  :"+income);
	}
	void calculateTax()
	{
		if(age<=65 && gender.equalsIgnoreCase("Male"))
		{
			
			if(income<=160000)
			{
				tax=0;
			}
			else if(income>160000 && income<=500000)
			{
				tax=(income-160000)*0.1; //400000-160000=240000*0.1=24000
			}
			else if(income>500000 && income<=800000)
			{
				tax=((income-500000)*0.2)+34000;
			}
			else if(income>800000)
			{
				tax=((income-800000)*0.3)+94000;
			}
			System.out.println("The tax you need to pay : Rs."+tax);
		}
		else
		{
			System.out.println("Wrong Category");
		}
	}
}

public class IncomeTax {

	public static void main(String[] args)
	{
		Tax t=new Tax();
		t.getdetails();
		t.showDetails();
		t.calculateTax();

	}

}
