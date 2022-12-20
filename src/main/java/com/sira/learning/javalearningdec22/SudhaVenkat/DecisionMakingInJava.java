package com.sira.learning.javalearningdec22.SudhaVenkat;

public class DecisionMakingInJava {

	public static void main(String[] args) {
		// If we do not provide the curly braces ‘{‘ and ‘}’ after if( condition ) then
		// by default if statement
		// will consider the immediate one statement to be inside its block
		int i = 10;
		if (i == 10)
			System.out.println("10 is less than 20");
		System.out.println("since condition is true i am also inside if block");

		// simple if with more than one statement
		if (i < 20) {
			i++;
			System.out.println("now the value of i after incrementation is " + i);
		}

		// if-else
		if (i < 20) {
			System.out.println(i + " is smaller than 20");
		} else {
			System.out.println(i + " is grater than 20");
		}

		// Nested - if statement Will only be executed
		// if statement above it is true
		if (i == 10 || i < 20) {
			if (i < 15) {
				System.out.println(i + " is less than 15");
			}
			if (i < 12) {
				i++;
				System.out.println(i + " is less than or equal to 12");
			}
		}

		// if-else-if ladder
		if (i == 10)
			System.out.println("i is 10");
		else if (i == 15)
			System.out.println("i is 15");
		else if (i == 20)
			System.out.println("i is 20");
		else
			System.out.println("value of i is " + i);

		// switch control statement to check size
		String size;
		switch (i) {
		case 2:
			size = "small number";
			break;
		case 5:
			size = "medium number";
			break;
		case 10:
			size = "big number";
			break;
		default:
			size = "unknown";
			break;
		}
		System.out.println("Size = " + size);

	}

}
