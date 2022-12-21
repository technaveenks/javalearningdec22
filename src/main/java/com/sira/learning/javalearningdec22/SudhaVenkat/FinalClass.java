package com.sira.learning.javalearningdec22.SudhaVenkat;

public class FinalClass {
	public final void familyname() {
		System.out.println("family name cannot be changed");
	}

	public static void main(String[] args) {
		FinalClass finalclassobj = new FinalClass();
		final int countrycode = 91;
		System.out.println(countrycode);
		// we cannot re-initialize the final variable
		// countrycode=countrycode+1;
		// System.out.println(countrycode);
		finalclassobj.familyname();

	}

}
