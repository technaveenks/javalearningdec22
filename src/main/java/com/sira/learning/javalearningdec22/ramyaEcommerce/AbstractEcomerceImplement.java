package com.sira.learning.javalearningdec22.ramyaEcommerce;

public class AbstractEcomerceImplement extends AbstractEcommerce {
	 

	 public void loginpage() {
		 
	 System.out.println("login into account");
	 }

	 public void username() {
		 System.out.println("enter username"); 
	 }
	 public void password() {
		 System.out.println("enter the password");
		 
	 }
	 public void submit() {
		 System.out.println("press the submit button");
		 
	 }
	 public void Category() {
	 
	 }
	
	public static void main(String[] args) {
		
		 AbstractEcomerceImplement absecommerce=new AbstractEcomerceImplement();
		 //AbstractEcommerce abstractecommerce=new AbstractEcommerce();
		 		 absecommerce.url();
		 		absecommerce.loginpage();
		 		absecommerce.password();
		 absecommerce.Category();
		 
		 absecommerce.username();
		 
	 
}
}
