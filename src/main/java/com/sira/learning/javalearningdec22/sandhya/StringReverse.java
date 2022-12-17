package com.sira.learning.javalearningdec22.sandhya;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String str = "sandhya";
		
		/*StringBuilder builder = new StringBuilder();
		
		int strLength = str.length();
		
		for(int i = strLength-1; i >= 0; i--) 
		
		{
			builder.append(str.charAt(i));
		}
		
		System.out.println("reverse of " + str + " is: " + builder.toString());*/
		
		String reverse="";
		char ch;

		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			reverse =ch+reverse;
			
		}
		System.out.println(reverse);
	}


}

