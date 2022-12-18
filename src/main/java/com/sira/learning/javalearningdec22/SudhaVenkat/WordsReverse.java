package com.sira.learning.javalearningdec22.SudhaVenkat;

public class WordsReverse {

	public static void main(String[] args) {
		String mystring = "This is a New Day";
		String reversestring = "";
		String mystringarray[] = mystring.split(" ");
		System.out.println(mystring);
		for (int i = mystringarray.length - 1; i >= 0; i--) {
			reversestring = reversestring + mystringarray[i] + " ";

		}
		System.out.println(reversestring);

	}

}
