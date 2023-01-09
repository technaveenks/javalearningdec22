package com.sira.learning.javalearningdec22.kalpana;
import java.util.Scanner;

public class calAssi {	
		 public static int convert(String str) {
		     int val = 0;    
		     val = Integer.parseInt(str);  
		     return val;
    }     
	    public static void add() {
	        String str;
	     	int sum1 = 0;
			Scanner scanner = new Scanner(System.in);
			 while(true) {
			System.out.println("enter ");
			str = scanner.nextLine();       
	        if (str.contains("=")) {System.out.println("add = "+sum1);break;}		
			else {int num = convert(str);	
			sum1 = sum1+num;}
	        }
	    }
		public static void sub(){			 
		      Scanner scanner = new Scanner(System.in);
		      System.out.println("enter value1 ");
		      try{int value1 = scanner.nextInt();
		      System.out.println("enter value2 ");
		      int value2 = scanner.nextInt();
		      int result =value1-value2;
		      System.out.println("sub = "+result);
		      }
		      catch(Exception e) {
		    	  System.out.println("Invalid no");
		      }
		}
		public static void mul(){			 
		      Scanner scanner = new Scanner(System.in);
		      System.out.println("enter value1 ");
		     try { int value1 = scanner.nextInt();
		      System.out.println("enter value2 ");
		      int value2 = scanner.nextInt();
		      int result =value1*value2;
		      System.out.println("mul = "+result);
		     }
		     catch(Exception e) {
		    	  System.out.println("Invalid no");
		      }
		      
		      }
		public static void div(){			 
		      Scanner scanner = new Scanner(System.in);
		      System.out.println("enter value1 ");
		     try { int value1 = scanner.nextInt();
		      System.out.println("enter value2 ");
		      int value2 = scanner.nextInt();
		     try { int result =value1/value2;
		     System.out.println("div = "+result);}
		     catch(Exception e) {System.out.println("divide by zero error");}		     
		     }
		     catch(Exception e) {
		    	  System.out.println("Invalid no");
		      }
		      
		      }
		public static void mod(){			 
		      Scanner scanner = new Scanner(System.in);
		      System.out.println("enter value1 ");
		     try { int value1 = scanner.nextInt();
		      System.out.println("enter value2 ");
		      int value2 = scanner.nextInt();
		     try { int result =value1%value2;
		      System.out.println("mod = "+result);
		     }
		     catch(Exception e) {System.out.println("divide by zero error");}		     
		     }		     
		     
		     catch(Exception e) {
		    	  System.out.println("Invalid no");
		      }
		      
		      }	
		public static void operator(){
			String operation;
			Scanner scanner = new Scanner(System.in);
			while(true) {
			System.out.println("enter operarion add or sub or mul or div or mod ");
			operation = scanner.nextLine();  
			switch(operation) {
		      case("add"):add();break;
		      case("sub"):sub();break;
		      case("mul"):mul();break;
		      case("div"):div();break;
		      case("mod"):mod();break;
		      default: System.out.println("enter a valid operation");
			}
			System.out.println("Do you want to continue,(Yes or No)");
			String cycle = scanner.nextLine();
			if(cycle.contains("No")) {System.out.println("Thank You"); break;}
			}
			
			}
		
		    

	public static void main(String[] args) {
		operator();
	}
}

