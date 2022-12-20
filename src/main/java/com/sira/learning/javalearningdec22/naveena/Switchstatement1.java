package com.sira.learning.javalearningdec22.naveena;

public class Switchstatement1 {

	public static void main(String[] args) {
		String Animal = "cat";
		switch(Animal)
		{
		  case "dog" :
			  System.out.println("The Animal is dog");
			  break;
		  case "Rabbit" :
			  System.out.println("The Animal is Rabbit");
			  break;
		  case "cat" :
			  System.out.println("The Animal is cat");
			  break;
		  default:
			  System.out.println("This is not a valid Animal case");
		}

	}

}
