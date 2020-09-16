package com.ahmed.adel.services;

import java.util.List;

import com.ahmed.adel.entity.Customer;



public interface CustomerService {

	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int theId);
	
	public void deleteCustomer(int theId);

	
}
