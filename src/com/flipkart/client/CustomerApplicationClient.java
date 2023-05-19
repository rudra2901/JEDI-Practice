/**
 * 
 */
package com.flipkart.client;

import com.flipkart.business.*;

/**
 * @author rudra.tiwari
 *
 */
public class CustomerApplicationClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Create the instance of customer Business class here
		CustomerInterface business = new CustomerBusiness();
		
		business.createCustomer();
		business.listCustomer();
		System.out.println(business.deleteCustomer(0));
		System.out.println(business.updateCustomer(0));
	}

}
