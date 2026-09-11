package project1;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter age");
int age=sc.nextInt();
if(age>=18) {
	System.out.println(" congragulation!! ");
	System.out.println("you are eligible for vote");
}else {
	System.out.println("sorry!!");
System.out.println("you are not eligible for vote ");
}
sc.close();
	}

}
