package com.sira.learning.javalearningdec22.ramyaInheritance;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ImplementPrg3 extends Inheritance2 {
	public void Factorial()
	{
		int i, fact=1;
		int number =5;
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial ofb+number+is" +fact);
	}
	
//public void DecendingOrder()
//{
	//int a[]= {1,2,3,4,5,6};
	
	//Arrays.sort(a);
	//reverse(a);
		//System.out.println(Arrays.toString(a));

public void ReverseNUmber() {
	int n=Array.getLength(null);
	int a[]= {1,2,3,4,5,6};
	
	for(int i=0;i<n/2;i++)
	{
		int temp=a[i];
		a[i]=a[n-i-1];
		a[n-i-1]=temp;
		ReverseNUmber();
		System.out.println(Arrays.toString(a));
	}
}

		
	


	public static void main(String[] args) {
		ImplementPrg3 impprg3=new ImplementPrg3();
		//impprg3.Factorial();
		impprg3.ReverseNUmber();
		//impprg3.even();
		//impprg3.palindrome();
		//impprg3.increase();
	}

	
		
	}

	
}
