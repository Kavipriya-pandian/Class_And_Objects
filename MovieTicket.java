package dxc;

import java.util.Scanner;
class Movie
{

	int movieId;
	int noOfSeats;
	double costPerTicket;
	public Movie(int movieId, int noOfSeats) {
		this.movieId = movieId;
		this.noOfSeats = noOfSeats;
		
	}
	
	public int getMovieId() {
		return movieId;
	}
	
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public double getCostPerTicket() {
		return costPerTicket;
	}
	public void setCostPerTicket(double costPerTicket) {
		this.costPerTicket = costPerTicket;
	}
}
	


public class MovieTicket
{
	
	public static void main(String[] args) 
	{
		double totalamount = 0;
		int movieId = 0;
		int noOfSeats = 0;
		double costPerTicket = 1;
		double interest=0.02;
		Movie m1=new Movie(movieId,noOfSeats);
		System.out.println("Enter the Movie Id:");
		
		Scanner sc=new Scanner(System.in);
		m1.getMovieId();
		movieId=sc.nextInt();
		System.out.println("Enter the No Of Seats:");
		m1.getNoOfSeats();
		noOfSeats=sc.nextInt();
		if(movieId==111 || movieId==112 || movieId==113)
		{
			if(movieId==111)
			{
				totalamount=7*noOfSeats;
			}
			else if(movieId==112)
			{
				totalamount=8*noOfSeats;
			}
			else if(movieId==113)
			{
				totalamount=8.5*noOfSeats;
			}
			double totalamount1=totalamount*0.02;
			totalamount1=Math.round(totalamount);
			System.out.println("Total Amount is:$"+totalamount1);
		}
		else
		{
			System.out.println("Sorry! Please enter valid moive ID and number of seats" );
		}
	
}
	
}


