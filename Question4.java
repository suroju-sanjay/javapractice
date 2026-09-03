package project1;

public class Question4 {

	public static void main(String[] args) {
	int x1=-2;
	int y=-5;
	int x=(x1++*2)-(y-2)+((x1--)-4)+(y++*4);
	System.out.println("x=:"+x);
	System.out.println("y=:"+y);
	System.out.println("x=:"+x);
	}
}