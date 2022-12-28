package com.sira.learning.javalearningdec22.SudhaVenkat;

public class MethodUnderstanding {

	int firstValue;
	int secondValue;
	int thirdValue;
	int addition, substraction, multiplication, division, modulo;

	MethodUnderstanding() {
		System.out.println("I am a constructor executes before any methods");
	}

	MethodUnderstanding(String name) {
		System.out.println("Constructor with parameter name" + name);
	}

	public int addition(int firstValue, int secondValue) {
		addition = firstValue + secondValue;
		return addition;
		// System.out.println("Addition of two values are = " + addition);
	}

	public int addition(int firstValue, int secondValue, int thirdValue) {
		addition = firstValue + secondValue + thirdValue;
		return addition;
		// System.out.println("Addition of two values are = " + addition);
	}

	public int substraction(int firstValue, int secondValue) {
		substraction = firstValue - secondValue;
		return substraction;
		// System.out.println("Substraction of two values are = " + substraction);
	}

	public int substraction(int firstValue, int secondValue, int thirdValue) {
		substraction = firstValue - secondValue - thirdValue;
		;
		return substraction;
		// System.out.println("Addition of two values are = " + addition);
	}

	public int multiplication(int firstValue, int secondValue) {
		multiplication = firstValue * secondValue;
		return multiplication;
		// System.out.println("Multiplication of two values are = " + multiplication);
	}

	public int multiplication(int firstValue, int secondValue, int thirdValue) {
		multiplication = firstValue * secondValue * thirdValue;
		return multiplication;
		// System.out.println("Multiplication of two values are = " + multiplication);
	}

	public int division(int firstValue, int secondValue) {
		division = firstValue / secondValue;
		return division;
		// System.out.println("Division of two values are = " + division);
	}

	public int division(int firstValue, int secondValue, int thirdValue) {
		division = firstValue / secondValue / thirdValue;
		return division;
		// System.out.println("Division of two values are = " + division);
	}

	public int modulo(int firstValue, int secondValue) {

		modulo = firstValue % secondValue;
		return modulo;
		// System.out.println("modulo of two values are = " + modulo);
	}

	public int modulo(int firstValue, int secondValue, int thirdValue) {

		modulo = firstValue % secondValue % thirdValue;
		return modulo;
		// System.out.println("modulo of two values are = " + modulo);
	}

	public static void main(String[] args) {
		MethodUnderstanding methodUnderstanding = new MethodUnderstanding();
		MethodUnderstanding methodUnderstandings = new MethodUnderstanding(" Sudha");
		System.out.println("Addition of two values are = " + methodUnderstanding.addition(30, 20));
		System.out.println("Addition of three values are = " + methodUnderstanding.addition(30, 20, 10));
		System.out.println("Substraction of two values are = " + methodUnderstanding.substraction(30, 20));
		System.out.println("Substraction of three values are = " + methodUnderstanding.substraction(30, 20, 10));
		System.out.println("multiplication of two values are = " + methodUnderstanding.multiplication(30, 20));
		System.out.println("multiplication of three values are = " + methodUnderstanding.multiplication(30, 20, 10));
		System.out.println("division of two values are = " + methodUnderstanding.division(30, 20));
		System.out.println("division of three values are = " + methodUnderstanding.division(30, 20, 10));
		System.out.println("modulo of two values are = " + methodUnderstanding.modulo(30, 20));
		System.out.println("modulo of three values are = " + methodUnderstanding.modulo(30, 20, 10));
	}

}
