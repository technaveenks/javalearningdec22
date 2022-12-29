package com.sira.learning.javalearningdec22.ramyaInterface;

import java.util.Scanner;

public class InterfaceImplementation implements Interfaceprogram, Interfaceprogram2 {

	 //sum=0, temp
	@Override
	public  void even() {
		Scanner reader=new Scanner(System.in); 
		System.out.println("enter the number");
		int n=reader.nextInt();
		if(n%2==0)
		
			System.out.println("given number is even number");
			else
				System.out.println("given number is odd number");
	
	}
	
	@Override
	public void greatest() {
		  
		int a, b, c, largest, temp;  
		//object of the Scanner class  
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();  
		 
		temp=a>b?a:b;  
		
		largest=c>temp?c:temp;  
	
		System.out.println("The largest number is: "+largest);  
		}  
		 
		





@Override
public void factorial() {
	
	
}

@Override
public void palindrome() {
	// TODO Auto-generated method stub
	
}
public static void main(String[] args) {
	InterfaceImplementation interimp=new InterfaceImplementation();
	interimp.even();
	interimp.greatest();
	
			
	
}
	

}