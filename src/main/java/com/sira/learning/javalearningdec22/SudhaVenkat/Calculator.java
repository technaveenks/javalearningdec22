package com.sira.learning.javalearningdec22.SudhaVenkat;

import java.util.Scanner;

public class Calculator {
	public static void addition() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int num2 = scanner.nextInt();
		System.out.println("The addition of numbers are" + (num1 + num2));

	}

	public static void substraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int num2 = scanner.nextInt();
		System.out.println("The substraction of given numbers are" + (num1 - num2));

	}

	public static void division() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int num2 = scanner.nextInt();
		System.out.println("Division of given numbers are" + (num1 / num2));

	}

	public static void modulo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int num2 = scanner.nextInt();
		System.out.println("The remainder of given numbers are" + (num1 % num2));

	}

	public static void multiplication() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int num2 = scanner.nextInt();
		System.out.println("Multiplication of given numbers are" + (num1 * num2));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the operation you want to perform");
		System.out.println("Choose 1 for addition");
		System.out.println("Choose 2 for substraction");
		System.out.println("Choose 3 for division");
		System.out.println("Choose 4 for modulo");
		System.out.println("Choose 5 for multiplication");
		System.out.println("Choose 0 for exit");
		int n = scanner.nextInt();
		switch (n) {
		case 1:
			addition();
			break;
		case 2:
			substraction();
			break;
		case 3:
			division();
			break;
		case 4:
			modulo();
			break;
		case 5:
			multiplication();
			break;
		case 0:
			System.exit(0);
		default:
			System.out.println("Please choose a number from above menu");
		}

	}

}
