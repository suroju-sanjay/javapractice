package project1;

import java.util.Scanner;

public class AtmWithdrawlSystem {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter amount :");
int amt=sc.nextInt();
int correctpin=1234;
double balance=120000.00;
System.out.println("enter pin");
int pin=sc.nextInt();
if (pin==correctpin) {
	System.out.println("correct pin ");
	System.out.println("enter withdraw amount");
	double withdrawAmount=sc.nextDouble();
	if (withdrawAmount<=balance) {
		System.out.println("withdraw success");
	
	}else if(withdrawAmount>balance){
		System.out.println("insufficiant balance");
	}else if(correctpin!=pin){
		System.out.println("incorrect pin");
	}
	double newbalance=balance-withdrawAmount;
	System.out.println("available balance="+balance);
	System.out.println("withdraw amount="+withdrawAmount);
	System.out.println("present balance="+newbalance);
	
	
	
}
sc.close();
	}

}
