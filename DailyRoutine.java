package project1;

import java.util.Scanner;

public class DailyRoutine {


	public static void main(String[] args) {
		String Name="sanjay";
Scanner sc=new Scanner(System.in);
System.out.println("enter time: ");
int t=sc.nextInt();
if(t>5 &&t<6) {
	System.out.println("GOOD MORNING"+Name+ "HAVE A NICE DAY");
}else if(t>=6 && t<8) {
	System.out.println(Name+ "thini institute ki ellu");
}else if (t>=8 &&t<12) {
	System.out.println(Name+"focus chey");
}else if (t>=12 && t<13) {
	System.out.println(Name+ "aakali ga undha");
}else if (t>=13 && t<14) {
	System.out.println(Name+ "lunch");
}else if (t>=14 && t<17) {
	System.out.println(Name+ "java practice chey");
}else if (t>=17 && t<18) {
	System.out.println(Name+"its break");
}else if (t>=18 && t<20) {
	System.out.println(Name+"soft skills practice");
}else if (t>=20 && t<22) {
	System.out.println(Name+ "complete dinner");
}else{
	System.out.println("go to sleep "+Name + "good night");
}
	}

}
