package project1;

import java.util.Scanner;

public class HotelBill {
	String roomtype;
	int numofdays;
	double roomprice;
	double foodcharges;
	double finalbill;
	double roomcost;

	public HotelBill() {
		this("unknown");
	}

	HotelBill(String roomtype) {
		this(roomtype, 0);
	}

	HotelBill(String roomtype, int numofdays) {
		this(roomtype, numofdays, 0.0);
	}

	HotelBill(String roomtype, int numofdays, double roomprice) {
		this(roomtype, numofdays, roomprice, 0.0);
	}
	HotelBill(String roomtype, int numofdays, double roomprice,double foodcharges){
	

		this.roomtype=roomtype;
		this.numofdays=numofdays;
		this.roomprice=roomprice;
		this.foodcharges=foodcharges;
		
		roomcost = roomprice*numofdays;
		finalbill=roomcost+foodcharges;
	}
	void display() {
		System.out.println("\n------------Hotel Bill-----------------------");
		System.out.println("roomtype :"+roomtype);
		System.out.println("num of days :"+numofdays);
		System.out.println("room price :"+roomprice);
		System.out.println("food charges :+"+foodcharges);
		System.out.println("final bill :"+ finalbill);
		System.out.println("room cost :"+roomcost);
	}

	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter room type :");
		String roomtype=sc.next();
		
		System.out.println("Enter room price :");
		double roomprice=sc.nextDouble();
		
		System.out.println("enter number of days :");
		int numofdays=sc.nextInt();
		
		System.out.println("enter food charges :");
		double foodcharges=sc.nextDouble();
		
		HotelBill h1=new HotelBill(roomtype,numofdays,foodcharges,roomprice);
	
h1.display();
	}

}
