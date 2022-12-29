package com.sira.learning.javalearningdec22.kalpana;
interface Ridable{
	 void ride();  }	

class car implements Ridable {
	public void ride() {
//all methods in implements class(Ridable) are not mandatory in abstract class	
		System.out.println("You are riding a car");
	}}
	class bike  implements  Ridable{
		public void ride() {
			System.out.println("You are riding a bike");
		}}
	class mechanic{
		void check( Ridable v) {
			//System.out.println("checking");
			v.ride();
		}
	}
	public class interface1 {
	public static void main(String[] args) {
		Ridable r = new car();
		bike b=new bike();
		car c=new car();
		mechanic m = new mechanic();
		m.check(b);
		m.check(c);
	}

}
