package com.sira.learning.javalearningdec22.Aruna;

public class StringAssignment {

	public static void main(String[] args) {
		// create strings
	    String first = "Hello";
	    String second = "world";

	    // print strings
	    System.out.println(first);   
	    System.out.println(second);  
	    
	    // get the length of greet
	   System.out.println("length "+first.length());
	    
	    // create second 
	    System.out.println("Second String: " + second);

	    // join two strings and uppercase
	    System.out.println(first + second);
		System.out.println("Response from concat method " + first.concat(second).toUpperCase());

		//charAt()
	       System.out.println(first.charAt(0));
	       System.out.println(second.charAt(2));
	       
	    //length()
	       System.out.println(first.length());
	       System.out.println(second.length());
	       
	    //equals()
	       System.out.println(first.equals(second));
	       
	    //equalsIgnoreCase()
	       System.out.println(first.equalsIgnoreCase(second));
	    
	   //compare to
	       System.out.println(first.compareTo(second));
	       System.out.println(first.compareToIgnoreCase(second));
	   // contains(CharSequence s)
	       System.out.println(first.contains(second));
	
	   //isEmpty()
	       String str1 = "Java Programming";
	       String str2 = "";

	       System.out.println(str1.isEmpty()); // false
	       System.out.println(str2.isEmpty()); // true
	       
	    // format string 
	       System.out.println(first.format(first, args));
	       System.out.println(second.format(null, first, args));
	       System.out.println(str1.formatted(args));
	       
	    // get bytes
	       System.out.println(str1.getBytes());
	       
	    //trim
	       System.out.println(first.trim());
	    // hash code
	       System.out.println(first.hashCode());
	       
	     
	       
	   
	
	}

}
