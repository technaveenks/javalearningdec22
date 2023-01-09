package com.sira.learning.javalearningdec22.SudhaVenkat;

import java.util.Scanner;

public class Calculator {
	public static void addition() {
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the first number"); 
		 * int num1 = scanner.nextInt();
		 * System.out.println("Enter the second number"); 
		 * int num2 = scanner.nextInt();
		 * System.out.println("The addition of numbers are" + (num1 + num2));
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many numbers you want to add");
		int n = scanner.nextInt();
		int[] a = new int[n];
		System.out.println("Please enter" + n + "numbers");
		int i = 0, sum = 0;
		while (i < n) {
			System.out.println("Enter number" + (i + 1));
			a[i] = scanner.nextInt();
			sum += a[i];
			i++;
		}
		System.out.println("sum of given four numbers " + sum);

	}

	public static void substraction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int num2 = scanner.nextInt();
		System.out.println("The substraction of given numbers are " + (num1 - num2));

	}

	public static void division() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int num2 = scanner.nextInt();
		System.out.println("Division of given numbers are " + (num1 / num2));

	}

	public static void modulo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int num2 = scanner.nextInt();
		System.out.println("The remainder of given numbers are " + (num1 % num2));

	}

	public static void multiplication() {

		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter the first number");
		// int num1 = scanner.nextInt();
		// System.out.println("Enter the second number");
		// int num2 = scanner.nextInt();
		// System.out.println("Multiplication of given numbers are" + (num1 * num2));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many numbers you want to multiply");
		int n = scanner.nextInt();
		int[] a = new int[n];
		System.out.println("Please enter" + n + "numbers");
		int i = 0, mul = 1;
		while (i < n) {
			System.out.println("Enter number" + (i + 1));
			a[i] = scanner.nextInt();
			mul = mul * a[i];
			i++;
		}
		System.out.println("multiplication of given " + n + " numbers " + mul);

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
