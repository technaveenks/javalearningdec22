package com.sira.learning.javalearningdec22.sandhya;

public class ForAndWhileloopExample {

	public static void main(String[] args) {
		String str = "mom";
		char ch;
		String temp = "";
		
		//for loop
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			temp=ch+temp;
			
		}
		
		//if condition
		if(str.equals(temp))
			System.out.println("given String is palindrome");
			else
				System.out.println("not palindrome");
		
		//while loop
		System.out.println("this is while loop program");
		int i = 0;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	
	}
	

}
