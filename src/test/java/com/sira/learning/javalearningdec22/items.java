package com.sira.learning.javalearningdec22;

import java.util.Scanner;

public class items extends Ecommerce{   
	String cardType;
		
	
	void confirm_purchase() {
		 Scanner scanner = new Scanner(System.in);
	 		System.out.println("enter your cardType"); 
	 		cardType =scanner.nextLine();
		switch(cardType) {
		case("Visa"):
		case("Master"):
		case("American Express"):
		case("Discover"):System.out.println("Amount "+ add2cart());break;
		default :System.out.println("Use a valid card");
		}
	}
	
   
	public static void main(String[] args) {
		items r1 = new items();
		r1.confirm_purchase();
	
		
		
	}


}
