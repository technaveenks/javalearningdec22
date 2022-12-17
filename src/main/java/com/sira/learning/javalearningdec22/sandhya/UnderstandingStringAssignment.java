package com.sira.learning.javalearningdec22.sandhya;

public class UnderstandingStringAssignment {

	
	// String reverse program
	public static void main(String[] args) {
		
		String str1 = "Good Morning",str2 = "Welcome To Java Program";
		System.out.println("First string is:  "+str1);
		System.out.println("Secong string is:  "+str2);
		
		//Returns true if length is 0.
		System.out.println(str1.isEmpty());
		
		//String concat() will Concatenates the specified string to the end of this string.
		System.out.println(str1.concat(str2)); 	
		
		//length() will returns the length of this string.
		System.out.println(str1.length());
		
		//toLowerCase()	Converts all of the characters in this String to lower case.
		System.out.println(str1.toLowerCase());   	
		
		 //toUpperCase	Converts all of the characters in this String to upper case.
		System.out.println(str1.toUpperCase());  
		
		//charAt() returns the char value at the specified index.
		System.out.println(str1.charAt(2));
		
		//contains() returns true if and only if this string contains the specified sequence of char values.
		System.out.println(str2.contains("a"));	
		
		//contentEquals() compares this string to the specified CharSequence.
		System.out.println(str2.contentEquals("Java"));
		
		//equals()	compares this string to the specified object.
		System.out.println(str1.equals(str2));		
		
		//equalsIgnoreCase() compares this String to another String, ignoring case considerations.
 
		System.out.println(str2.equalsIgnoreCase("Welcome"));	
		
		//endsWith() tests if this string ends with the specified suffix.
		System.out.println(str2.endsWith("g"));	
		
		//startsWith()	Tests if the  string beginning at the specified index starts with the specified prefix.
		System.out.println(str1.startsWith("g"));
		
		//indexOf()	returns the index within this string of the first occurrence of the specified substring.
		System.out.println(str1.indexOf('d'));	
		
		//subString() returns a new string that is a substring of this string.
		System.out.println(str2.substring(3));	
		
		//Returns a copy of the string, with leading and trailing whitespace omitted.
		System.out.println(str1.trim());
		
		// replace() returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
		System.out.println(str2.replace('a', 'o'));
		
		System.out.println(str1.replaceAll(str1, str2));
		
		//This object (which is already a string!) is itself returned.
		System.out.println(str1.toString());
		
		System.out.println(str2.isBlank());
		
		//Returns a hash code for this string.
		System.out.println(str1.hashCode());
		
		
		

	}
	}

