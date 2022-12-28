package com.sira.learning.javalearningdec22.ramya;

public class AccessSpecifier {
	int a=10; 
			int b=20;
	private void addititon() {
		int sum=a+b;
		System.out.println("Addition of 2 number"+sum);
		
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void substraction() {
		int sub=a-b;
		System.out.println("Substraction of 2 number"+sub);
	}

	public static void main(String[] args) {
		AccessSpecifier accspec= new AccessSpecifier();
		accspec.addititon();
		accspec.substraction();
				
		
		// TODO Auto-generated method stub
	}

}
