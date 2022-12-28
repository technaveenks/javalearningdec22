package com.sira.learning.javalearningdec22.kalpana;


	interface school{
		int zipcode = 77006;//final,static
		void idcard();
		void dresscode();
		//default void display() {
			//System.out.println("display");	
		//}
	}
	abstract class staff implements school{
		//implement class methods are not mandatory in abstract class
	public void idcard() {
		System.out.println("staff class, idcard method");
		}
		public void teachers() {
			System.out.println("staff class ,teacher method");	}
		}
	class students implements school{
					
		public void idcard() {System.out.println("Students idcard");}				
					
					
		public void dresscode() {System.out.println("Students dresscode");}	
				
			}
	class labAssistance implements school{		
		public void idcard() {
			System.out.println("labAssistance idcard");}	
		
		public void dresscode() {
			System.out.println("labAssistance dresscode");}
		public void display() {//default method can be override
			System.out.println("labAssistance class display ");	
		}
			
		}
		
	
	
	public class interface2 {
	public static void main(String[] args) {
		school sc = new students();
		sc.dresscode();
		sc.idcard();
		//sc.display();//display method is not implemented in students class
		
		school la = new labAssistance ();
		la.dresscode();
		la.idcard();
		//la.display();
		//school st = new staff ();
		
		
		

	}

}
