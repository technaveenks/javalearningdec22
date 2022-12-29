package com.sira.learning.javalearningdec22.kalpana;



public class NestedClass2 {
	void outer(){
		 System.out.println("outer class method1");}
		static class inner1{
			 int outNum;
			 void inner1method1() {
				 System.out.println("inner1 class method1");
			 class inner2{
				 int In2num = 30;
				 void inner2method1() {
					 System.out.println("inner2 class method1"); 
				 }
				public  void inner2method2() {
					 System.out.println("inner2 class method2"); 
				 }
					 }}}
		 	

		public static void main(String[] args) {
			NestedClass2 nc1 = new NestedClass2();
			
			NestedClass2.inner1 out =new NestedClass2.inner1();//static no need object
		    nc1.outer();
			out.inner1method1();

			
			//inner1.inner2 i = nc1.new inner2();
			//i.inner2method1();
			//i.inner2method2();
			 //System.out.println(i.In2num);

		}

	
		

	}


