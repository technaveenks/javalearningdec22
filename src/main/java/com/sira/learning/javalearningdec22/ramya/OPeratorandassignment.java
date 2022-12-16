package com.sira.learning.javalearningdec22.ramya;

public class OPeratorandassignment {

	public static void main(String[] args) {
		int x=10;
		int y=15;
		// operator
		//Addition 
		System.out.println("addition of 2 numbers:"+(x+y));
		//subtraction
		System.out.println("addition of 2 numbers:"+(x-y));
		//multipication
		System.out.println("addition of 2 numbers:"+(x*y));
		//division
		System.out.println("addition of 2 numbers:"+(x/y));
		//mod
		System.out.println("addition of 2 numbers:"+(x%y));
		// Increament operator
		//increament operator
		
		System.out.println( "enter the value of" +x);
		//postfix
		
		x++;
		System.out.println( "now the value of:"+x);
		//prefix
		System.out.println( x);
		++x;
		System.out.println("now the value of" +y);
		// decrement operator
		System.out.println("value of"+y);
		--y;
			
		System.out.println("now the value of" +x);
		y--;
		System.out.println(y);
		// Assignment operator
		
	

	    // assign value using =
	    int var = x;
	    System.out.println("var using =: " + var);

	    // assign value using =+
	    var += x;
	    System.out.println("var using +=: " + var);

	    // assign value using =*
	    var *= x;
	    System.out.println("var using *=: " + var);
	    
	    
	    System.out.println("x is " + x + " and y is " + y);

	    // == operator
	    System.out.println(x == y);  // false

	    // != operator
	    System.out.println(x != y);  // true

	    // > operator
	    System.out.println(x > y);  // false

	    // < operator
	    System.out.println(x < y);  // true

	    // >= operator
	    System.out.println(x >= y);  // false

	    // <= operator
	    System.out.println(x <= y);  // true
		
	}	

	

	}


