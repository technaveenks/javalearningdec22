package com.sira.learning.javalearningdec22;

public class stringFormat {

	public static void main(String[] args) {
		String fname="kalpana";
		int value=10;
		float cost = 10.98f;
		//17.format
		String sf1=String.format("my name is %s",fname);
		String sf2=String.format(" my name is %s","Adithan");
		String sf17=String.format("%s","Hi");
		System.out.println(sf1); 
		System.out.println(sf2);
		System.out.println(sf17);
		//float
		String sf3=String.format("your amount is %f", cost);
		System.out.println(sf3);
		String sf4=String.format("your amount is %33.5f",33.33 );
		System.out.println(sf4);
		String sf5=String.format("your amount is %32.5f",33.33 );
		System.out.println(sf5);
		String sf6=String.format("your amount is %33.0f",33.33 );
		System.out.println(sf6);
		String sf7=String.format("your amount is %33.3f",33.33 );
		System.out.println(sf7);
		String sf8=String.format("your amount is %30.3f",33.33 );
		System.out.println(sf8);
		String sf9=String.format("your amount is %20.3f",33.33 );
		System.out.println(sf9);
		String sf10=String.format("your amount is %2.3f",-33.33 );
		System.out.println(sf10);
		String sf11=String.format("%f", 33.33);
		System.out.println(sf11);
		//int
		String sf12=String.format("your amount is |%d|", 33);
		System.out.println(sf12);
		String sf13=String.format("your amount is |%5d|", 33);
		System.out.println(sf13);		
		String sf14=String.format("your amount is |%-5d|", 33);
		System.out.println(sf14);
		String sf15=String.format("your amount is |%05d|", 33);
		System.out.println(sf15);
		String sf16=String.format("your amount is %d", value);
		System.out.println(sf16);
		String sf18=String.format("%c",'t');
		System.out.println(sf18);
		String sf19=String.format("%b",'h');
		System.out.println(sf19);
		String sf20=String.format("%b",7);
		System.out.println(sf20);
		String sf21=String.format("%b",0);
		System.out.println(sf21);
		String sf22=String.format("%b",'_');
		System.out.println(sf22);
		
		






	}

}
