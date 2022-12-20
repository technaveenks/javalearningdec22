package com.sira.learning.javalearningdec22.ramya;

public class Palindrome {

	public static void main(String[] args) {
		String str= "Rar", reverse = "";
		int strLength =str.length();
		for (int i= (strLength -1); i>=0; --i)
		{
		reverse= reverse + str.charAt(i);	
		}
		if (str.toLowerCase().equals(reverse.toLowerCase())) {
			
			System.out.println(str + " is a Palindrome String.");
		}
		else {
		  System.out.println(str + " is not a Palindrome String.");
		}

			
				

			}

		


	}


