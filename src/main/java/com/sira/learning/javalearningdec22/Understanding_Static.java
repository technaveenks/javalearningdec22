package com.sira.learning.javalearningdec22;

public class Understanding_Static {
static int number=10;
	
	public static void addition() {
		int num1 = 10;
		int num2 = 20;

		int total = num1 + num2;
		System.out.println(" addition of two numbers are " + total);
		System.out.println(" Number = "+ number);
		number = number+5;
	}
	
	static {
		System.out.println(" This is static A block");
		number = number+5;
	}
	

	public static void main(String[] args) {
		
		addition();
		System.out.println(" Number = "+ number);
	}
	
	public static class arithmetic{
		
	}

}
