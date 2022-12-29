package com.sira.learning.javalearningdec22.ramyaInheritance;

public class Inheritance2 extends Inheritanceprg1 {
	public void even(){
		
	int num=100;
	System.out.println("List of even numbers from 1 to 100" +num);
	for(int i=0;i<num;i++) {
		if (i%2==0)
		{
			System.out.println(i+ " ");
		}
	}
		}

	
	

	public static void main(String[] args) {
		Inheritance2 inherit2=new Inheritance2();
		
		inherit2.even();
		inherit2.increase();
		inherit2.palindrome();
	}

}
