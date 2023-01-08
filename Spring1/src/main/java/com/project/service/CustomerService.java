package com.project.service;

import java.util.List;

import com.project.entity.Customer;

public interface CustomerService {
	
	//method for Saving Customer Detail
	Customer saveCustomer(Customer customer);
	
	//method for Fetching Customer Detail by Id
	Customer  getCustomerById(int cId);
	
	//method for Updating Customer Detail By Id
	Customer updateCustomerById(int cId,Customer customer);
	
	//method for Deleting Customer Detail By Id
	void deleteCustomerById(int cId);
	
	//method for Fetching all Customer Detail 
	List<Customer> displayAllCustomer();
	
	//method for Fetching Customer Detail By Number
	Customer getCustomerByNumber(long cNumber);

}
