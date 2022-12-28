package com.sira.learning.javalearningdec22.Madhavi;

import java.util.Scanner;

public class Understanding_Scanner {
	public static void main(String[] args) {
		System.out.println(" Please Enter your name :");

		Scanner scanner = new Scanner(System.in);

		String inputValue = scanner.nextLine();
		System.out.println(" Entered value is " + inputValue);
		System.out.println(" Enter first number :" );
		int firstValue = scanner.nextInt();
		System.out.println(" Entered number is " + firstValue);
		System.out.println(" Enter second number :" );
		int secondValue = scanner.nextInt();
		System.out.println(" Entered number is " + secondValue);
		int result = firstValue+secondValue;
		System.out.println(result);

	}

}
