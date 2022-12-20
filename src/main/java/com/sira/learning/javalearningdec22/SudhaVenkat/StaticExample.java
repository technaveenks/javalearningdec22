package com.sira.learning.javalearningdec22.SudhaVenkat;

public class StaticExample {

	// non-static variable

	int nonstaticvar = 11;
	// static variable
	static int staticvar = 22;

	// non static method
	int addition(int num1, int num2) {
		return num1 + num2;

	}

	// static method
	static int substraction(int num1, int num2) {
		return num1 - num2;
	}

	static int minvar, maxvar;

	static {
		minvar = 33;
		maxvar = 44;

	}

	public static void main(String[] args) {
		// The Math class in Java has almost all of its members or methods static.
		// So, we can access its members without creating instances of the Math class.
		System.out.println("Value of PI = " + Math.PI);
		System.out.println("2^2 = " + Math.pow(2, 2));

		// creating object for non static method
		StaticExample staticexample = new StaticExample();
		System.out.println("non static method calling using object " + staticexample.addition(20, 15));
		System.out.println("static method calling without creating object " + substraction(30, 15));
		System.out.println("non static variable calling using object " + staticexample.nonstaticvar);
		System.out.println("static variable calling without creating object " + staticvar);
		// accessing static block variables
		System.out.println("minvar from static block " + minvar + " maxvar from static block " + maxvar);

	}

}
