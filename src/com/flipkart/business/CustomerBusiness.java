/**
 * 
 */
package com.flipkart.business;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.flipkart.bean.*;

/**
 * @author rudra.tiwari
 *
 */
public class CustomerBusiness implements CustomerInterface{
	
	private List<Customer> customer = new ArrayList<Customer>();
	
	
	public void createCustomer() {
		System.out.println("Create a Customer Object");
		
		Scanner sc = new Scanner(System.in);
		
		int id;
		String var;
		
		Customer customerNew = new Customer();
		
		System.out.println("\nEnter ID : ");
		id = sc.nextInt();
		customerNew.setCustomerID(id);
		
		System.out.println("\nEnter Name : ");
		var = sc.next();
		customerNew.setCustomerName(var);
		
		System.out.println("\nEnter Email : ");
		var = sc.next();
		customerNew.setEmail(var);
		
		System.out.println("\nEnter Address : ");
		var = sc.next();
		customerNew.setCustomerAddress(var);
		
		customer.add(customerNew);
	}
	
	public boolean updateCustomer(int id) {
		
		if(!deleteCustomer(id))
			return false;
		
		Scanner sc = new Scanner(System.in);
		
		String var;
		
		Customer customerNew = new Customer();
		
		customerNew.setCustomerID(id);
		
		System.out.println("\nEnter Name : ");
		var = sc.next();
		customerNew.setCustomerName(var);
		
		System.out.println("\nEnter Email : ");
		var = sc.next();
		customerNew.setEmail(var);
		
		System.out.println("\nEnter Address : ");
		var = sc.next();
		customerNew.setCustomerAddress(var);
		
		customer.add(customerNew);
		return true;
	}
	
	public boolean deleteCustomer(int id) {
		int ind = findCustomer(id);
		
		if(ind == -1)
			return false;
		
		customer.remove(ind);
		return true;
	}
	
	public void listCustomer() {
		// TODO: Show customer details
		System.out.println("List all Customer Objects \n");
		
		for(Customer var: customer) {
			System.out.print("Customer ID : " + var.getCustomerID());
			System.out.print("Customer Name : " + var.getCustomerName());
			System.out.print("Email : " + var.getEmail());
			System.out.print("Customer Address : " + var.getCustomerAddress() + "\n");
		}
	}
	
	public int findCustomer(int id) {
		int i = 0;
		for(Customer var: customer) {
			if(var.getCustomerID() == id)
				return i;
			i++;
		}
		return -1;
	}

}
