package com.sira.learning.javalearningdec22.SudhaVenkat;

public class Loops {

	public static void main(String[] args) {

		// while loop -- based on boolean condition code will be executed
		int i = 0;
		System.out.println("result of while loop");
		while (i <= 10) {

			System.out.println(i);
			i++;

		}

		// do-while first statements in do loop executes before condition
		System.out.println("result of do-while loop");
		do {

			System.out.println(i);
			i++;
		} while (i <= 15);// 21 will be printed before checking the condition

		// for loop till now initialization,condition and incrementation we did
		// separately
		System.out.println("result of for loop");
		for (i = 1; i <= 5; i++) {
			System.out.println(i);
		}

	}

}
