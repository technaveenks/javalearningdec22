package com.sira.learning.javalearningdec22;

public class UnderstandingStrings {

	public static void main(String[] args) {

		String fName = "Ethan";
		String lName = "DMello";
		System.out.println(fName);
		System.out.println(fName + lName);
		System.out.println("Response from concat method " + fName.concat(lName).toUpperCase().toLowerCase());
		System.out.println(fName.charAt(4));
		System.out.println(fName.length());
		
	}

}
