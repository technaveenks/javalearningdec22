package com.sira.learning.javalearningdec22.ramya;

public class UsingStatic {
static int numbers=10;
public static void addition() {
	int value1=10;
	int value2=20;
	//int number=10;
	int total=value1+value2;
	System.out.println("addition of 2 values are:"+total);
	System.out.println("number"+numbers);
	numbers=numbers+5;
}
static {
	System.out.println("This is static block");
	 numbers=numbers+5;
}
	public static void main(String[] args) {
		
addition();

System.out.println("Number="+numbers);
	}
public static class arithmetic{
}
}
