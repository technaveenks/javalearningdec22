package com.sira.learning.javalearningdec22.Madhavi;

public class Learningstringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      StringBuilder str = new StringBuilder("strong ");
	      System.out.println("string = " + str);
	   // appends b - a boolean  as string to the StringBuilder
	      
	      str.append(true);
	      System.out.println("string="+(true));
	      StringBuilder str1 = new StringBuilder("notstrong ");
	      System.out.println("string = " + str1);
	      str1.append(false);
	      System.out.println("string="+(false));
	      
	      //append(char c)
	      
	      str.append(3);
	      System.out.println("string="+(3));
	      
	      //append(char[] str)
	      str.append(10);
	      System.out.println("string="+(10));
	      
	  	//append(CharSequence s)
	      str.append("Hello my world");
	      System.out.println("string="+("hello my world"));
	      
	      //append(CharSequence s, int start, int end)
	      //str - the characters to be appended.
	     // offset - the index of the first char to append.
	      //len - the number of chars to append.
	      str.append("Hi harry", 0, 8);
	      System.out.println("Hi harry");
	      
	      //append(double d)
	      str = new StringBuilder("abcd ");
	      //str.append(30.3000000);
	      System.out.println("string="+str);
	      
	      //append(float f)
	      str = new StringBuilder("abcd ");
	      //str.append(10.2);
	      System.out.println("string="+str.append(10.2));
	      
	      //append(int i)
	      str = new StringBuilder("abcd ");
	      System.out.println("string = " + str);
	      //str.append(45);
	      System.out.println("string="+str.append(45));
	      
	      //append(long lng)
	      str = new StringBuilder("abcd"+" ");
	      System.out.println("string="+str);
	   //   str.append(222222222l);
	      System.out.println("string="+str.append(222222222));
	      
	      //append(Object obj)
	      str = new StringBuilder("dreams");
	      System.out.println("string"+ str.append(" cometrue"));
	      
	      //append(StringBuffer sb)
	      //str = StringBuilder()
	     
	     
	}

}
