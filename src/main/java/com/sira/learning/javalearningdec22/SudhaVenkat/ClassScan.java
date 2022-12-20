package com.sira.learning.javalearningdec22.SudhaVenkat;

import java.util.Scanner;

public class ClassScan {

	public static void main(String[] args) {
		System.out.println("Please Enter your name :");

		Scanner scanner = new Scanner(System.in);
		int firstValue;
		int secondValue;
		String inputValue = scanner.next();
		System.out.println("Hello " + inputValue + " How are you lets use scanner for arithmetic operations");
		System.out.println("Enter first number  :");
		firstValue = scanner.nextInt();
		System.out.println("Enter second number :");
		secondValue = scanner.nextInt();
		System.out.println("Addition of first and second numbers are " + (firstValue + secondValue));
		System.out.println("Subtraction of first and second numbers are " + (firstValue - secondValue));
		System.out.println("Multiplication of first and second numbers are " + (firstValue * secondValue));
		System.out.println("Division of first and second numbers are " + (firstValue / secondValue));
		System.out.println("Mudulo of first and second numbers are " + (firstValue % secondValue));

	}

}
