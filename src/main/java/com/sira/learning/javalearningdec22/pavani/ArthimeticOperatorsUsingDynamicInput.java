package com.sira.learning.javalearningdec22.pavani;

import java.util.Scanner;

public class ArthimeticOperatorsUsingDynamicInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc= new Scanner(System.in);   
			System.out.println("Enter First Number:");  
			int num1= sc.nextInt();                 
			//System.out.print("You have entered first string: "+str1);       
			System.out.println("");	
			
			System.out.println("Enter Second Number:");
			int num2= sc.nextInt();            //reads string   
			//System.out.print("You have entered Second string: "+str2);   
			System.out.println("");
			System.out.println("Addition of two numbers" + (num1 + num2) );
			System.out.println("Subtraction of two numbers" + (num1 - num2) );
			System.out.println("Multiplication of two numbers" + (num1 * num2) );
			System.out.println("Division of two numbers" + (num1 / num2) );
		

	}

}
