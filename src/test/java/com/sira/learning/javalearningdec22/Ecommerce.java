package com.sira.learning.javalearningdec22;

import java.util.Scanner;

abstract public class Ecommerce {

	
	public int add2cart() {
		 String items;int c = 0;int p =0;int tot = 0;
		 Scanner scanner = new Scanner(System.in);
	 		System.out.println("Choose your item: Apple= $7; Orange = $9; Berry = $5");    	 
	     items = scanner.nextLine();
	     switch(items) {
	     case("apple"):{c=7;
	     System.out.println("how many lb");
	     p= scanner.nextInt();
	     tot =c*p ;
	     break;}
	     case("orange"):{c=9;
	     System.out.println("how many lb");
	     p= scanner.nextInt();
	     tot =c*p ;
	     break;}
	     case("berry"):{c=5;
	     System.out.println("how many lb");
	     p= scanner.nextInt();
	     tot =c*p ;
	     break;}
	     default : System.out.println("enter your item"); 
	     }
	     return tot; 

	 }
	abstract void confirm_purchase();
	

	public static void main(String[] args) {
		

	}

}
