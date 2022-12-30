package com.sira.learning.javalearningdec22.ethan;

public class Equals {

	public static void main(String[] args) {
		String name = "Hello";
		String details = "Hello";
		boolean isEquals = details.equals(name);
		System.out.println(isEquals);
		if (name == details) {
			System.out.println(" Both are same ");
		} else {
			System.out.println(" Both are different ");
		}

		// boolean isEquals = name.equals(details);
		// int isEquals = name.compareToIgnoreCase(details);
		// System.out.println(" value of isEquals "+ isEquals);
	}

}
