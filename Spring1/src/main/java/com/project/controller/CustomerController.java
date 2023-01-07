package com.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Customer;
import com.project.service.CustomerService;

//Rest controller for Handling all incoming request from rest APi
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	
	//save Customer detail using post mapping
	@PostMapping("/saveC")
	public ResponseEntity<Customer> saveC(@RequestBody@Valid Customer customer){
		return new ResponseEntity<Customer>(cs.saveCustomer(customer),HttpStatus.OK ) ;
	}
	//fetching Customer By Customer Id by using Get mapping
	@GetMapping("/getById/{cId}")
	public ResponseEntity<Customer> getById (@PathVariable("cId") int pId){
		return new ResponseEntity<Customer>(cs.getCustomerById(pId),HttpStatus.OK );
	}
	
	//Updating Customer Details by using Put mapping
	@PutMapping("/updateById/{cId}")
	public ResponseEntity<Customer> updateById(@PathVariable("cId")int pId,@RequestBody Customer customer){
		return new ResponseEntity<Customer>(cs.updateCustomerById(pId, customer),HttpStatus.OK );
	}
	
	//Deleting Customer by CustomerId using Delete mapping
	@DeleteMapping("/deleteById/{cId}")
	public ResponseEntity<String> deleteById(@PathVariable("cId") int cId){
		cs.deleteCustomerById(cId);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK );
	}
	
	//Fetching All Customer Details by Using Get  Mapping
	@GetMapping("/getAllCustomer")
	public List<Customer> getAllCustomer(){
		return cs.displayAllCustomer();
	}
	
	//Fetching Customer detail by Number using Get Mapping
	@GetMapping("/getByNumber/{cNumber}")
	public ResponseEntity<Customer> getByNumber(@PathVariable("cNumber") long cNumber){
		return new ResponseEntity<Customer>(cs.getCustomerByNumber(cNumber),HttpStatus.OK );
	}
}
