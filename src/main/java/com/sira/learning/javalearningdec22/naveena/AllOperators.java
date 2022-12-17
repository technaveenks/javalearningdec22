package com.sira.learning.javalearningdec22.naveena;

public class AllOperators {

	public static void main(String[] args) {
	   int x = 20;
	   int y = 10;
	   int z;
	   //Arithmetic Operators + - *  / %
	   System.out.println("The addition of two numbers :" +(z=x+y));
	   System.out.println("The substraction of two numbers :" +(z=x-y));
	   System.out.println("The multiplication of two numbers :" +(z=x*y));
	   System.out.println("The division of two numbers :" +(z=x/y));
	   System.out.println("The modulo of two numbers :" +(z=x%y));
	   
	   //Increment and Decrement Operators
	   z = ++x;
	   System.out.println("The preincrement value of x :" +x);
	   System.out.println("The preincrement value of z :" +z);
	   
	   z = x++;
	   System.out.println("The postincrement value of x :" +x);
	   System.out.println("The postincrement value of z :" +z);
	   
	   z = --x;
	   System.out.println("The predecrement value of x :" +x);
	   System.out.println("The predecrement value of z :" +z);
	   
	   z = x--;
	   System.out.println("The postdecrement value of x :" +x);
	   System.out.println("The postdecrement value of z :" +z);
	   
	   //Relational Operators <,>,<=,>=
	   System.out.println(x<y);
	   System.out.println(x>y);
	   System.out.println(x<=y);
	   System.out.println(x>=y);
	   
	   //Equality Operators ==, !=
	   System.out.println(x==y);
	   System.out.println(x!=y);
	   
	   

	}

}
