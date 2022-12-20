package com.sira.learning.javalearningdec22.pavani;
import java.util.*;  

public class StringsUsingDynamicInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc= new Scanner(System.in);   
		System.out.println("Enter First String:");  
		String str1= sc.nextLine();                 
		//System.out.print("You have entered first string: "+str1);       
		System.out.println("");	
		
		System.out.println("Enter Second String:");
		String str2= sc.nextLine();              //reads string   
		//System.out.print("You have entered Second string: "+str2);   
		System.out.println("");
		System.out.println("Concatenation of two Strings:" + str1.concat(str2));
	

	}

}
