package com.sira.learning.javalearningdec22.pavani;

public class UsingStringBuffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			   
			      StringBuffer str1 = new StringBuffer(" Hello ");
			      System.out.println("Using StringBuffer Class and its methods");
			      
			      //length method
			     
			      System.out.println("length of the given string : " + str1.length());
			      
			      //append method
			      str1.append(" World ");
			      System.out.println("Appending two strings " + str1);
			
			
			      //insert method			      	      
			        str1.insert(1, "Java ");
			        // Now original string is changed
			        System.out.println("Inserting a string to existing string :" + str1);
			       
			        //replace method
			        str1.replace(1,5,"My "); 
			        System.out.println("Replacing 1 to 5 chars with given string :" + str1);
			        
			        //delete method
			        str1.delete(1,3); 
			        System.out.println("Deleting 1 to 3 chars : " + str1);
			        
			        //reverse method
			        str1.reverse();
			        System.out.println("Reversing the string :" +str1);
			        
			        
			        

	}

}
