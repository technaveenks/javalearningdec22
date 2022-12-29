package com.sira.learning.javalearningdec22.ramyaInheritance;

public class Inheritanceprg1 {
	public void palindrome() {
		String str= "Rar",reverse = "";
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
	public void increase()
	{
		int i;
		int sum=0;
		//int j=0;
		 
		for(i=0;i<=5;i++)
		{
			System.out.println(i);
		}
for(i=0;i<=20;i++) {
	sum=sum+i;
	System.out.println("sum of number:" +sum);
}
	}
public static void main(String[] args) {
	Inheritanceprg1 inhertprg1=new Inheritanceprg1();
	inhertprg1.palindrome();
	inhertprg1.increase();
}
}


