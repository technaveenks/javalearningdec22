package com.sira.learning.javalearningdec22.ramya;

public class Whileloop{
public static void main(String[] args) {

	int i=0, reverse=0, num=1234;
	while(i<=5)
	{
		System.out.println("enter the value"+i);
		i++;
	}
	while(num!=0) {
		int digit=num%10;
		reverse=reverse*10+digit;
		num=10;
	}
	System.out.println("Reversed Number: " + reverse);
	//reverse number
	
}

}