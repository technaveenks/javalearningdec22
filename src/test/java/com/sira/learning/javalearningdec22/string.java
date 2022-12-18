package com.sira.learning.javalearningdec22;

public class string {

	public static void main(String[] args) {
	String fname = "kalpana";
	String lname = "Adithan";
	String mname = "keep up the good work";
	 System.out.println(fname + lname);
	//1.charAt()
	System.out.println(fname.charAt(0));
	System.out.println(fname.charAt(1));
	//2.codePointAt
	System.out.println(fname.codePointAt(0));
	System.out.println(fname.codePointAt(1));
	//3.codePointBefore
	System.out.println(fname.codePointBefore(1));
	System.out.println(fname.codePointBefore(2));
	//4.codePointCount
	System.out.println(fname.codePointCount(0,7));
	System.out.println(fname.codePointCount(0,2));
	System.out.println(lname.codePointCount(0,7));	
	//5.indexOf("string")
	System.out.println(mname.indexOf("up"));	
	System.out.println(mname.indexOf("work"));
	//6.length()
	System.out.println(lname.length());	
	System.out.println(mname.length());
	//7.toUpperCase, toLowerCase()
	System.out.println(mname.toUpperCase());
	System.out.println(mname.toLowerCase());
	//9.concat()
	System.out.println(fname.concat(lname));
	System.out.println(fname.concat(" Hi!"));
	//
	
	}

}
