package com.sira.learning.javalearningdec22.ramya;

public class LearningEncapsulation {
	
	 private int value = 10;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static void main(String[] args) {
		
		LearningEncapsulation lencap=new LearningEncapsulation();
		System.out.println(lencap.value);
	}


}