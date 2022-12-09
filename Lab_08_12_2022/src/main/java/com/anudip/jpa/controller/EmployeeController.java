package com.anudip.jpa.controller;

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

import com.anudip.jpa.entity.Employee;
import com.anudip.jpa.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService es;
	
	//save passenger detail using post mapping
	@PostMapping("/savee")
	public ResponseEntity<Employee>saveE(@Valid @RequestBody Employee employee){
		return new ResponseEntity <Employee>(es.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	//fetching passenger by using pId get mapping
	@GetMapping("/gete/{eId}")
	public ResponseEntity<Employee>getE(@PathVariable("eId") long eId){
		return new ResponseEntity<Employee>(es.getByIdEmployee(eId),HttpStatus.OK);
	}
	
	//Displaying all the records using getallEmployees
	@GetMapping("/displayalle")
	public List<Employee> displayallE(){
		return es.getallEmployees();
	}
	
	//Updating passenger detail by pId using put mapping
	@PutMapping("/updatee/{eId}")
	public ResponseEntity<Employee>updateE(@PathVariable("eId") long eId,@RequestBody Employee employee){
		return new ResponseEntity<Employee>(es.updateByIdEmployee(employee, eId),HttpStatus.OK);
	}
	
	//Deleting passenger using delete mapping
	@DeleteMapping("/deletee/{eId}")
	public ResponseEntity<String>deteleE(@PathVariable("eId") long eId ){
		es.deleteByIdEmployee(eId);
		return new ResponseEntity<String>("Deletd Successfully",HttpStatus.OK);
	}
	
}
