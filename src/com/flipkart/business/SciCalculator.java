/**
 * 
 */
package com.flipkart.business;

import java.lang.Math;

/**
 * @author rudra.tiwari
 *
 */
public class SciCalculator extends CalculatorBusiness{
	
	public double sin(double a) {
		return Math.sin(Math.toRadians(a));
	}
	
	public double cos(double a ) {
		return Math.cos(Math.toRadians(a));
	}
	
	public double tan(double a) {
		return Math.tan(Math.toRadians(a));
	}
	
	public double sqrt(double a) {
		return Math.sqrt(a);
	}
	
	public double exp(int a, int b) {
		return Math.pow(a, b);
	}
}
