package com.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Customer;
import com.project.exception.CustomerNotFoundException;
import com.project.repository.CustomerRepository;
import com.project.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	//Creating Customer Repository Object and making it Auto wired
	@Autowired
	CustomerRepository cRepo;
	
	//Adding New Customer Details By Save Operation
	@Override
	public Customer saveCustomer(Customer customer) {
		return cRepo.save(customer);
	}

	//Fetching Customer Details By Customer Id
	@Override
	public Customer getCustomerById(int cId) {
		return cRepo.findById(cId).orElseThrow(()-> new CustomerNotFoundException("Entered Customer Id Not Present in the database"));
	}
	
	//Updating Customer Details finding by customer Id 
	@Override
	public Customer updateCustomerById(int cId, Customer customer) {
		Customer c  = cRepo.findById(cId).orElseThrow(()->new CustomerNotFoundException("Entered Customer Id Not Present in the database"));
		c.setCNumber(customer.getCNumber());
		c.setCEmail(customer.getCEmail());
		c.setCAdress(customer.getCAdress());
		
		cRepo.save(c);
		return c;
	}

	//Deleting Customer Details By Customer Id
	@Override
	public void deleteCustomerById(int cId) {
		cRepo.findById(cId).orElseThrow(()-> new CustomerNotFoundException("Entered Customer Id Not Present in the database"));
		cRepo.deleteById(cId);
	}

	//Fetching All Customer Details by find All Operation
	@Override
	public List<Customer> displayAllCustomer() {
		return cRepo.findAll();
	}

	//Fetching Customer Details By Customer Number
	@Override
	public Customer getCustomerByNumber(long cNumber) {
		return cRepo.getCustomerByNumber(cNumber);
	}
	
	

}
