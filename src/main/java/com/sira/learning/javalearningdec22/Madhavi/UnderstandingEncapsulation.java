package com.sira.learning.javalearningdec22.Madhavi;

public class UnderstandingEncapsulation {
	
	// Hide information from others
	
	// Member, function, class
	
	// public, private, protected, default
	
	private int value = 20;
	
	 protected int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static void main(String[] args) {
		
		UnderstandingEncapsulation uEncap = new UnderstandingEncapsulation();
		System.out.println(uEncap.value);
		
	}
	
	

}
