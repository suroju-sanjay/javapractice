package project1;

import java.util.Scanner;

public class FruitsVegetablesBilling {

	public static void main(String[] args) {
		System.out.println("welcome to nalgonda rythu bazal market");
Scanner sc=new Scanner(System.in);
System.out.println("enter category ");
String catg=sc.next();
switch(catg){
	case"veg"->{
		System.out.println("enter a item ");
		String item=sc.next();
		double vegprice=0;
		switch(item) {
		case"tmt"->{
			System.out.println("tomoto per kg is 50rs ");
			double tmtprice=0;
		vegprice=vegprice+tmtprice;
		}case "potato" -> {
		    System.out.println("Potato per kg is 40 rs");
		    double potatoPrice = 40;
		    vegprice = vegprice + potatoPrice;
		}

		case "onion" -> {
		    System.out.println("Onion per kg is 45 rs");
		    double onionPrice = 45;
		    vegprice = vegprice + onionPrice;
		}

		case "carrot" -> {
		    System.out.println("Carrot per kg is 60 rs");
		    double carrotPrice = 60;
		    vegprice = vegprice + carrotPrice;
		}

		case "beans" -> {
		    System.out.println("Beans per kg is 70 rs");
		    double beansPrice = 70;
		    vegprice = vegprice + beansPrice;
		}

		case "brinjal" -> {
		    System.out.println("Brinjal per kg is 50 rs");
		    double brinjalPrice = 50;
		    vegprice = vegprice + brinjalPrice;
		}
		}
		}
	case"fru"->{}
	default->System.out.println("entered category is not available");
	}

	}

}
