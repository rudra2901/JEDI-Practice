/**
 * 
 */
package com.flipkart.client;

import com.flipkart.business.*;

/**
 * @author rudra.tiwari
 *
 */
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		CalculatorBusiness business = new CalculatorBusiness();
		
//		SciCalculator business = new SciCalculator();
		
		MaxCalculator business = new MaxCalculator();
		MinCalculator minBusiness = new MinCalculator();
		
		System.out.println("Addition of 3 & 19 = " + business.add(3, 19));
		System.out.println("Subtraction of 19 with 5 = " + business.subtract(19, 5));
		System.out.println("Multiplication of 6 with 3 = " + business.multiply(6, 3));
		System.out.println("Division of 21 with 7 = " + business.divide(21, 7));
		System.out.println(business.divide(3, 0));
		
				
		System.out.println("Sin value of 30 degrees : " + business.sin(30));
		System.out.println("Cos value of 30 degrees : " + business.cos(30));
		System.out.println("Tan value of 45 degrees : " + business.tan(45));		
		System.out.println("Square root of 121 : " + business.sqrt(121));
		System.out.println("3 raised to power 4 : " + business.exp(3,4));
		
		System.out.println("Absolute value of -8 : " + business.abs(-8));
		
		System.out.println("Maximum out of (3, 5, 9) is : " + business.maxInt(3, 5, 9));
		System.out.println("Minimum out of (3, 5, 9) is : " + minBusiness.minInt(3, 5, 9));
	}

}
