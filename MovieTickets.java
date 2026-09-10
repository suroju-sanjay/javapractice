package project1;

import java.util.Scanner;

public class MovieTickets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR NAME : ");
		String name = sc.nextLine();
		System.out.println("ENTER AGE :");
		int age = sc.nextInt();
		System.out.println("ENTER MOVIe TIME :");
		int time= sc.nextInt();
		System.out.println("ENTER NUMBER OF TICKETS :");
		int tickets=sc.nextInt();
		int price=0;
		if (age<12) {
			price=100;
		
		}else if (age>=12 && age<=18) {
			price=150;
		}else if (age>=19 && age <=59) {
			price=200;
		}else if (age>=60){
			price=250;
		}if (time>=17 && time<=20) {
			price=price+50;
		}else if (time>20) {
			price=price+100;
		}
		int total=price*tickets;
		double discount=0;
		if(tickets>5) {
			discount=price*0.15;
			
		}else if (tickets<=6 && tickets<10) {
			discount=price*0.35;
		}
		double finalamount=total-discount;
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		System.out.println("time "+time);
		System.out.println("no of tickets :"+tickets);
		System.out.println("price :"+price);
		System.out.println("total :"+total);
		System.out.println("discount :"+discount);
		System.out.println("final amount :"+finalamount);
	}

}
