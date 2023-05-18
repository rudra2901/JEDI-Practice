/**
 * 
 */
package com.flipkart.business;

/**
 * @author rudra.tiwari
 *
 */
public class ExtraFunctionCalculator extends SciCalculator{
	
	public int abs(int a) {
		if(a < 0)
			return -1*a;
		return a;
	}

}
