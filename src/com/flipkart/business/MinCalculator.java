/**
 * 
 */
package com.flipkart.business;

/**
 * @author rudra.tiwari
 *
 */
public class MinCalculator extends ExtraFunctionCalculator{
	
	public int minInt(int a, int b, int c) {
		int m = a;
		if(m > b)
			m = b;
		if(m > c)
			m = c;
		
		return m;
	}

}
