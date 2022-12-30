package com.sira.learning.javalearningdec22.kalpana;

public class NestedClass1 {
	void outer(){
	 System.out.println("outer class method1");}
	 class inner1{
		 int outNum;
		 void inner1method1() {
			 System.out.println("inner1 class method1");
		 }
		 class inner2{
			 int In2num = 30;
			 void inner2method1() {
				 System.out.println("inner2 class method1"); 
			 }
			 void inner2method2() {
				 System.out.println("inner2 class method2"); 
			 }
				 }}
	 	

	public static void main(String[] args) {
		NestedClass1 nc1 = new NestedClass1();
		
		NestedClass1.inner1 out =nc1.new inner1();
	    nc1.outer();
		out.inner1method1();
		inner1.inner2 i =out.new inner2();
		i.inner2method1();
		i.inner2method2();
		 System.out.println(i.In2num);

	}

}
