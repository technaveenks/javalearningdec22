package com.sira.learning.javalearningdec22.Gayathri;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String name = "Hello";
		
			 String details = "Hello";
			 boolean isEquals = details.equals(name);
			 System.out.println(isEquals);
			 
			 if(name==details) {
				 System.out.println("Both are same");
			 }else {
				 System.out.println("Both are differnt");
			 }
			 
			//boolean isEquals = name.equals(details);
			//int isEquals = name.compareToIgnoreCase(details);
			//System.out.println(" Value of isEquals "+ isEquals);
			
				 
	}

}
