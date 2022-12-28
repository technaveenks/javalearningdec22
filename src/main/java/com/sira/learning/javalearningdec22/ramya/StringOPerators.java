package com.sira.learning.javalearningdec22.ramya;

public class StringOPerators {

	public static void main(String[] args) {
		String fname=" Ramya";
		String lname="Nalla";
		// It concat 2 words
		System.out.println(fname.concat(lname).toUpperCase());
		System.out.println(fname.concat(lname).toLowerCase());
		System.out.println(fname.charAt(3));
		System.out.println(fname .compareToIgnoreCase(lname));
		System.out.println(fname .compareTo(lname));
		System.out.println(fname .compareToIgnoreCase(lname));
		System.out.println(fname .equals(lname));
		System.out.println(fname .equalsIgnoreCase(lname));
		System.out.println(fname .codePointAt(5));
		System.out.println(fname .codePointBefore(3));
		System.out.println(fname .codePointCount(1, 3));
		System.out.println(fname .contains(lname));
		System.out.println(fname .contentEquals(fname));
		System.out.println(fname .contentEquals(lname));
		System.out.println(fname .endsWith(fname));
		System.out.println(fname .equals(lname));
		System.out.println(fname .hashCode());
		System.out.println(fname .indent(3));
		System.out.println(fname .indexOf(fname));
		System.out.println(fname .indexOf(lname));
		System.out.println(fname .indexOf(fname, 3));
		System.out.println(fname .isEmpty());
		System.out.println(fname .lastIndexOf(fname));
		System.out.println(fname .lastIndexOf(lname, 4));
		System.out.println(fname .length());
		System.out.println(fname .offsetByCodePoints(4, 2));
		//System.out.println(fname .replace(, 3));
		//System.out.println(fname .getChars(fname, 2, 3, 0));
		System.out.println(fname .strip());
		System.out.println(fname .stripIndent());
		System.out.println(fname .subSequence(2, 3));
		System.out.println(fname .startsWith(lname));
		System.out.println(fname .toCharArray() );
		System.out.println(fname.describeConstable());
		System.out.println(fname .offsetByCodePoints(4, 2));
		System.out.println(fname .toString());
		System.out.println(fname .trim());
		System.out.println(fname .translateEscapes());
		System.out.println(fname .lines());
		

	}

}
