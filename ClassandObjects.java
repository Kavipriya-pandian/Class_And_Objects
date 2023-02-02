package dxc;

import java.util.Scanner;

/*
 * Design a class to overload a function sum() as follows:
(a) void sum(int n) – with one int argument that finds the sum of the digits in n.
(b) void sum(Integer n) – with one Integer argument that finds the sum of the digits in n.
Also create the main() method to call the above methods
*/
public class ClassandObjects 
{
	
	
	static void sum(int n)  //finding the sum of digits n
	{
		int rem=0;
		while(n>0) {
		
		
		
		rem=rem+(n%10);
		n=n/10;
		
		
	}
		System.out.println("Sum of digits: "+rem);
	}
	
	static void sum(Integer n1)
	{
		int rem=0;
		
		while(n1>0) 
		{
		
		
		
		rem=rem+(n1%10);
		n1=n1/10;
		
		
	}
		
	System.out.println("Sum of digits: "+rem);
	}
	
public static void main(String[] args)
{
	int n;
	Integer n1;
	System.out.println("Enter the number 1:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();

	System.out.println("Enter the number 2:");
	n1=sc.nextInt();
	
	sum(n);
	sum(n1);
	
	
	
	
	
}
}

