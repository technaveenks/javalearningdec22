package com.sira.learning.javalearningdec22.naveena;

public class Switchstatement {

	public static void main(String[] args) {
		int day = 7;
		switch(day){
			case 1:
			{
				System.out.println("The day is Sunday");
			    break;
			}
			case 2:
			{   
				System.out.println("The day is Monday");
			    break;
			}
			case 3:
			{
				System.out.println("The day is Tuesday");
			    break;
			}
			case 4:
			{
				System.out.println("The day is Wednesday");
			    break;
			}
			case 5:
			{
				System.out.println("The day is Thursday");
			    break;
			}
			case 6:
			{
				System.out.println("The day is Friday");
			    break;
			}
			case 7:
			{
				System.out.println("The day is Saturday");
			    break;
			}
			default:
			{
				System.out.println("This is not a valid day number");
			}
				
				
		}

	}

}
