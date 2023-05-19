/**
 * 
 */
package com.flipkart.business;

/**
 * @author rudra.tiwari
 *
 */
public class CustomerBusiness implements CustomerInterface{
	
	
	public void createCustomer() {
		// TODO: Create a customer object 
		System.out.println("Create a Customer Object");
	}
	
	public boolean updateCustomer(int id) {
		// TODO: Implement updating functions
		return true;
	}
	
	public boolean deleteCustomer(int id) {
		// TODO: Implement deletion
		return true;
	}
	
	public void listCustomer() {
		// TODO: Show customer details
		System.out.println("List all Customer Objects");
	}

}
