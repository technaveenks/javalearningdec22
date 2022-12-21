package com.sira.learning.javalearningdec22.SudhaVenkat;

public class EncapsulationCheck {
	private int privatenum = 10;

	int defaultnum = 20;

	private void privatemethodaccess() {
		System.out.println("you are accessing private method from EncapsulationCheck class");
	}

	void defaultmethodaccess() {
		System.out.println("you are accessing default method from EncapsulationCheck class");
	}

	public int getPrivatenum() {
		return privatenum;
	}

	public void setPrivatenum(int privatenum) {
		this.privatenum = privatenum;
	}

	public static void main(String[] args) {
		EncapsulationCheck encapcheck = new EncapsulationCheck();
		System.out.println("accessing private number from EncapsulationCheck class " + encapcheck.getPrivatenum());
		encapcheck.privatemethodaccess();
		System.out.println("accessing default number from EncapsulationCheck class " + encapcheck.defaultnum);
		encapcheck.defaultmethodaccess();
	}

}
