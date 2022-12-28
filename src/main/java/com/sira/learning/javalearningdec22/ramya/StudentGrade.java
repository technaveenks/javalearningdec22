package com.sira.learning.javalearningdec22.ramya;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the students marks percentage");
		Integer mark =scan.nextInt();
		System.out.println("Enter the students marks"+mark);
		if (mark>=90)
		{
System.out.println("student got grade A");
		}
else if (mark<=80 && mark>70) {
	System.out.println("student got grade B");
	}
else if (mark<60 && mark>40)
{ 
	System.out.println("student got grade c");
}
else 
{
	System.out.println("student got grade d");

}
}
}
