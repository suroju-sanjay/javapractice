package project1;

import java.util.Scanner;

public class PerfectNumber {
	

	public static void main(String[] args) {
		int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number ");
int n=sc.nextInt();

for(int i=1;i<=n/2;i++) {
	if(n%i==0) {
			sum=sum+i;

	}
}if(sum==n) {
	System.out.println("number is perfect");
}else if(sum!=n) {
	System.out.println("number is not perfect");
}
	}

}