/**
 * 
 */
package com.flipkart.business;

/**
 * @author rudra.tiwari
 *
 */
public class CalculatorBusiness {

	// Business Logic methods here

	public int add(int a, int b) {

		return a + b;
	}

	public int subtract(int a, int b) {

		return a - b;
	}

	public int multiply(int a, int b) {

		return a * b;
	}

	public int divide(int a, int b) {

		if (b != 0)
			return a / b;

		System.out.println("Divide by 0 error");
		return 0;
	}

}
