package com.sira.learning.javalearningdec22.ramya;

public class LearningAbstractImplement extends LearningAbstract {
int a=10;
int b=20;
	@Override
	public void addtion() {
		int sum=a+b;
		
		System.out.println("addition of 2 number"+sum);	
		
	}
	//public void substraction()
	//{
		//System.out.println("substratcion of 2 numbers");
		
	//}

	public static void main(String[] args) {
		LearningAbstractImplement learabstractimp= new LearningAbstractImplement();	
		//LearningAbstract learnabstract=new LearningAbstract();
				learabstractimp.addtion();
				learabstractimp.substraction();
				
}
}
