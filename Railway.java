package project1;

import java.util.Scanner;

public class Railway {
	String passangername;
	int age;
	String source;
	String destination;

	Railway(String passangername, int age, String source, String destination) {
		this.passangername = passangername;
		this.age = age;
		this.source = source;
		this.destination = destination;

	}

}

class tickets extends Railway {
	int NumberOfTickets;
	int Price;
	int TotalAmount;
	tickets(){
		this("",0,"","",0,500);
	}

	public tickets(String passangername, int age, String source, String destination, int NumberOfTickets,int price) {
		super(passangername, age, source, destination);
		this.NumberOfTickets=NumberOfTickets;
		this.Price=price;
		this.TotalAmount=0;
		

	}

	void bookticket() {
		TotalAmount = NumberOfTickets * Price;
		System.out.println("total amount :" + TotalAmount);
	
	}

	void bookdetails() {
		System.out.println("passanger name :" + passangername);
		System.out.println("passanger age :" + age);
		System.out.println("source :" + source);
		System.out.println("destination :" + destination);
		System.out.println("number of tickets :" + NumberOfTickets);
		System.out.println("price :" + Price);
		System.out.println("total amount :" + TotalAmount);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter name :");
		String name = sc.next();
		
		System.out.println("enter age :");
		int age = sc.nextInt();
		
		System.out.println("enter source :");
		String source = sc.next();

		System.out.println("enter destination :");
		String destination=sc.next();
		
		System.out.println("enter number of tickets :");
		int Numberoftickets=sc.nextInt();	
		
		System.out.println("enter price :");
		int price=sc.nextInt();
		
		tickets t1=new tickets(name,age,source,destination,Numberoftickets,price);
		t1.bookdetails();
		t1.bookticket();
		}

}
