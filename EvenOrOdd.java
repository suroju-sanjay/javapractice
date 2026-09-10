package project1;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("ENTER NUMBER : ");
int number=sc.nextInt();
if(number %2==0) {
	System.out.println("its even number ");
}else {
	System.out.println("its odd number ");
}
sc.close();
}

}
