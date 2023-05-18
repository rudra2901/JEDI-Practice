/**
 * 
 */
package com.flipkart.business;

/**
 * @author rudra.tiwari
 *
 */
public class MaxCalculator extends ExtraFunctionCalculator{
	
	public int maxInt(int a, int b, int c) {
		int m = a;
		if(m < b)
			m = b;
		if(m < c)
			m = c;
		
		return m;
	}

}
