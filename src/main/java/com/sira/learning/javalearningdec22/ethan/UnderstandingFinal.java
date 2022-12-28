package com.sira.learning.javalearningdec22.ethan;

public class UnderstandingFinal {
	
	final int value = 20;
	int age = 20;
	
	public static void main(String[] args) {
		
		UnderstandingFinal understandingFinal = new UnderstandingFinal();
		System.out.println(understandingFinal.age);
		understandingFinal.age=30;
		System.out.println(understandingFinal.age);		
		System.out.println(understandingFinal.value);
		
		int z = understandingFinal.value+1;
		
		
	}

}
