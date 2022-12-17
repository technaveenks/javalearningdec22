package com.sira.learning.javalearningdec22.naveena;

public class Strings {

	public static void main(String[] args) {
		
		String fName = "United";
		String lName = "kingdom";
       System.out.println(fName + lName);
       
       //concat(),toUpperCase(),toLowercase()
       System.out.println("Response from concat method :" + fName.concat(lName).toUpperCase().toLowerCase());
       
       //charAt()
       System.out.println(fName.charAt(2));
       System.out.println(lName.charAt(2));
       
       //length()
       System.out.println(fName.length());
       System.out.println(lName.length());
       
       //equals()
       System.out.println(fName.equals(lName));
       
       //equalsIgnoreCase()
       System.out.println(fName.equalsIgnoreCase(lName));
       
       //isEmpty()
       System.out.println(fName.isEmpty());
       System.out.println(lName.isEmpty());
       
       //compareTo()
       String s1 = "a";
       String s2 = "A";
       System.out.println(s1.compareTo(s2));
       
       //contains()
       System.out.println(fName.contains("n"));
       System.out.println(lName.contains("g"));
       
       //replace()
       String s = "aaaa";
       System.out.println(s.replace("a", "b"));
       System.out.println(s.replace("a", "c"));
       
       //substring()
       System.out.println(fName.substring(1));
       System.out.println(fName.substring(2));
       
       //trim()
       String s3 = "   abcd   ";
       System.out.println(s3.trim());
       
       //indexOf()
       String s4 = "Maryland";
       System.out.println(s4.indexOf('y'));
       System.out.println(s4.indexOf('d'));
       
       //lastindexOf()
       String s5 = "happy";
       System.out.println(s5.lastIndexOf('p'));
       
       //startsWith(),endsWith()
       System.out.println(s5.startsWith("y"));
       System.out.println(s5.endsWith("y"));
       
       //valueOf()
       int a1 = 10; float a2 =20.2f; double a3 = 30.3;long a4 =50L; char a5 = 'd'; short a6 = 70;
       System.out.println("The value of string : " + String.valueOf(a1));
       System.out.println("The value of string : " + String.valueOf(a2));
       System.out.println("The value of string : " + String.valueOf(a3));
       System.out.println("The value of string : " + String.valueOf(a4));
       System.out.println("The value of string : " + String.valueOf(a5));
       System.out.println("The value of string : " + String.valueOf(a6));
	}

}
