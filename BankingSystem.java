package project1;

import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String holdername = "sanjay";
		double balance = 10000.00;
		int choice;
		String yn = null;
		do {
			System.out.println("***************WELCOME BANK SERVICE*******************");
			System.out.println("ENTER YOUR CHOICE ");
			System.out.println("ACCOUNT HOLDER NAME " + holdername);
			System.out.println("1.CHECK BALANCE ");
			System.out.println("2.DEPOSITE MONEY ");
			System.out.println("3.WITHDRAW MONEY ");
			System.out.println("4.TRANSFER MONEY ");
			System.out.println("5.EXIT");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("current balance ₹ " + balance);
				break;
			case 2:
				System.out.println("ENTER DEPOSIT AMOUNT ");
				double depositeamount = sc.nextDouble();
				if (depositeamount > 0) {
					balance = balance + depositeamount;
					System.out.println("DEPOSITE AMOUNT SUCCESSFULL");
					System.out.println("new balance ₹:" + balance);
				} else {
					System.out.println("invalid deposite ");
				}
				break;
			case 3:
				System.out.println("WITHDRAW AMOUNT ");
				double withdrawAmount = sc.nextDouble();
				if (withdrawAmount > 0 && withdrawAmount <= balance) {
					balance = balance - withdrawAmount;
					System.out.println("Withdrawal Successful");
					System.out.println("Remaining Balance: ₹" + balance);
				} else {
					System.out.println("insufficiant balance or invalid ");
				}
				break;
			case 4:
				System.out.println("ENTER ACCOUNT NUMBER ");
				long accountnumber = sc.nextLong();
				System.out.println("ENTER TRANSFER AMOUNT ");
				double transferamount = sc.nextDouble();
				if (transferamount > 0 && balance >= transferamount) {
					balance = balance - transferamount;
					System.out.println("REMAINING BALANCE :" + balance);
				} else {
					System.out.println("INSUFFICIANT FUNDS ");
				}
				break;
			case 5:
				System.out.println("THANK YOU FOR USING BANKING SYSTEM ");
			}

		 
		System.out.println("DO YOU WANT TO CONTINUE? YES FOR y, NO FOR n");
		yn = sc.next();
		}while (yn.equalsIgnoreCase("y"));
		System.out.println("You clicked for exit");
			sc.close();
	
}
}