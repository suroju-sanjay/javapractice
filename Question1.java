package project1;

public class Question1 {

	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int z = x++ - --y - x + y - x-- + y--;
		System.out.println("*******question 1********************");
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}

}
