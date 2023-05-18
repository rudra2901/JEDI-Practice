/**
 * 
 */
package com.flipkart.business;

import com.flipkart.demoabstract.DemoAbstract;

/**
 * @author rudra.tiwari
 *
 */
public class CalculatorBusiness extends DemoAbstract{

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

	@Override
	public String testHello() {
		// TODO Auto-generated method stub
		return "Hello from Base Class";
	}

}
