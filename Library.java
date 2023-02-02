package dxc;

import java.util.Scanner;

/*
 * Define a class called Library with the following description :
Instance variables/data members :
int acc_num — stores the accession number of the book
String title — stores the title of the book
String author — stores the name of the author
Member methods:
(i) void input ( ) — To input and store the accession number, title and author.
(ii) void compute ( ) — To accept the number of days late, calculate the display the fine charged at the rate of Rs. 2 per day.
(iii) void display( ) — To display the details in the following format:
Accession      Number      Title Author
Write a main method to create an object of the class and call the above member methods

 */
public class Library {
    int acc_num;
    String title;
    String author;
    int nod;  //nod is no of days
    static int total=0;
    Scanner sc=new Scanner(System.in);
    void input()
    {
    	
    	System.out.println("Enter the Accession number");
    	acc_num=sc.nextInt();
    	System.out.println("Enter the Title of the book");
    	title=sc.next();
    	System.out.println("Enter the name of the Author");
    	author=sc.next();
    }
    void compute()
    {
    	System.out.println("Enter the Number of days late");
    	nod=sc.nextInt();
    	if(nod>1)
    	{
    		total=2*nod;
    	    return;
    	}
    }
    void display()
    {
    	System.out.println("Accession Number  Title \t Author \t Number");
    	
    	
    	System.out.println(acc_num+"\t\t"+title+"\t\t"+author+"\t\t"+nod);
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library l=new Library();
		l.input();
		l.compute();
		l.display();
		System.out.println("\n The total cost of the fine amount is Rs."+total);
	}

}
