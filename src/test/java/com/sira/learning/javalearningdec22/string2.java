package com.sira.learning.javalearningdec22;

public class string2 {

	public static void main(String[] args) {
		String fname = "KALPANA";
		String ffname = "KALPANA";
		String lname = "kalpana";
		String mname = "keep up the good work!";
		
		 System.out.println(fname + lname);
		//11.compareTo()
				System.out.println(fname.compareTo(lname));
				System.out.println(fname.compareTo(mname));
				System.out.println(fname.compareTo("sahana"));
		//12.compareToIgnoreCase()
				System.out.println(fname.compareToIgnoreCase(lname));
				System.out.println(fname.compareToIgnoreCase(mname));
				System.out.println(fname.compareToIgnoreCase("sahana"));
		//13.contains()
				System.out.println(mname.contains("good"));
				System.out.println(mname.contains("up the good"));
				System.out.println(mname.contains("kalpana"));
		//14.endsWith()
				System.out.println(mname.length());
				System.out.println(mname.endsWith("work"));
				System.out.println(mname.endsWith("work!"));
				System.out.println(mname.endsWith("ork"));
				System.out.println(mname.endsWith("rk!"));
				System.out.println(mname.endsWith("good"));
		//15.equals()
				System.out.println(fname.equals(lname));
				System.out.println(fname.equals(mname));
				System.out.println(fname.equals(ffname));
		//16.equalsIgnoreCase()
				System.out.println(fname.equalsIgnoreCase(lname));
				System.out.println(fname.equalsIgnoreCase(mname));
				System.out.println(fname.equalsIgnoreCase(ffname));	
	
				
				
				
			

				
				
				


	}
}
