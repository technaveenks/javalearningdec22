package com.sira.learning.javalearningdec22.ramya;

public class ArrayTwodimensions {

	public static void main(String[] args) {
		int array1[][]= {{2,3,4},{4,5,6},{3,4,5}};
		
		for (int i=0;i<array1.length;i++)
		{ 
			
			for(int j=0;j<array1[i].length;j++)
				System.out.println("enter the number:" +array1[i][j]);
			
		}

	}

}
