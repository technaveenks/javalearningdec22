package com.sira.learning.javalearningdec22.sandhya;

public class ConstructorExample {
	int x,y;
	ConstructorExample()
	{
		System.out.println("default constructor");
	}
	ConstructorExample(int a,int b)
	{
		x = a;
		y = b;
		System.out.println("parameterized constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorExample constructorExampl = new ConstructorExample(10,20);
	}
	

}
