package com.sira.learning.javalearningdec22.ramya;

public class StringBufferandBuilder {

	public static void main(String[] args) {
		String str="Ramya";
		String str1="nalla";
		System.out.println(str);
	StringBuffer sbf= new StringBuffer(str);
	//String Str="ramya";
	sbf.append("Jyoshsna");
	System.out.println(sbf);
	sbf.replace(0, 3, "amy" );
	System.out.println(sbf);
	sbf.delete(0, 2);
	System.out.println(sbf);
	str.toLowerCase();
	System.out.println(str);
	System.out.println(sbf.charAt(3));
	System.out.println(str1.compareToIgnoreCase(str));
	System.out.println(str1 .compareTo(str));
	System.out.println(str1.compareToIgnoreCase(str));
	System.out.println(str1 .equals(str));
	
	System.out.println(sbf .codePointAt(5));
	System.out.println(sbf .codePointBefore(3));
	
	
	}

}
