package dxc;

import java.util.Scanner;

/*
 * Define a class named Fruit Juice with the following description: [15]
Instance variables / data members :
int product_code — stores the product code number
String flavour — stores the flavour of the juice (E.g. orange, apple, etc.)
String pack_type — stores the type of packaging (E.g. tetra-pack, PET bottle, etc.)
in pack_size — stores package size (E.g. 200 ml, 400 ml, etc.)
in product_price — stores the price of the product
Member methods :
(i) FruitJuice() — Default constructor to initialize integer data members to 0 and String data members to.
(ii) void input( ) — To input and store the product code, flavour, pack type, pack size and product price.
(iii) void discount( ) — To reduce the product price by 10.
(iv) void display() — To display the product code, flavour, pack type, pack size and product price.
 */
public class Juice
{
	
	
		int productcode;
		String flavours;
		String  packettype;
		int packetsize;
		int productprice;
		Juice()
		{
			int productcode=0;
			String flavours=null;
			String packettype=null;
			int packetsize=0;
			int productprice=0;
		}
		 void input()
			{
			 Scanner sc=new Scanner(System.in);
			System.out.println("Enter the product code");
			
	        productcode=sc.nextInt();
	        System.out.println("Enter the Flavour");
	        flavours=sc.next();
	        System.out.println("Enter the Packet Type");
	        packettype=sc.next();
	        System.out.println("Enter the Packet size in ml");
	        packetsize=sc.nextInt();
	        System.out.println("Enter the product Price");
	        productprice=sc.nextInt(); 
		       
		       
		        
			}
		int discount()
		{
			productprice=productprice-10;
			return productprice;
		}
		void display()
		{
			
	        
	        System.out.println("The product code  :"+productcode);
	        
	        System.out.println("The Flavour       :"+flavours);
	       
	       System.out.println("The Packet Type    :"+packettype);
	       
	        System.out.println("The Packet size in ml:"+packetsize);
	        
	        System.out.println("Product Price     : "+productprice);
	       
		}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Juice j=new Juice();
        
        j.input();
        j.discount();
        j.display();
        
	}

}
