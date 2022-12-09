package com.anudip.jpa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anudip.jpa.entity.Employee;
import com.anudip.jpa.exception.EmployeeNotFoundException;
import com.anudip.jpa.repository.EmployeeRepository;
import com.anudip.jpa.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository eRepo;

	@Override
	//Insert & Saving employee details into Employee Table by using save() method
	public Employee saveEmployee(Employee emp) {
		return eRepo.save(emp);
	}

	@Override
	//Fetching Employee Detail by findById() method or else throw exception
	public Employee getByIdEmployee(long eId) {
		return eRepo.findById(eId).orElseThrow(()-> new EmployeeNotFoundException("Entered Employee ID is not Present in Dtabase"));
	}

	@Override
	//Fetching all Employee Details by findAll() method 
	public List<Employee> getallEmployees() {
		return eRepo.findAll();
	}

	@Override
	//Updating Employee detail by findById() method
	public Employee updateByIdEmployee(Employee emp, long eId) {
		Employee empl = eRepo.findById(eId).orElseThrow(()-> new EmployeeNotFoundException("Entered Employee is Not Present in the Database"));
		
		//set New Details
		empl.setEEmail(emp.getEEmail());
		empl.setENumber(emp.getENumber());
		
		eRepo.save(empl);
		
		return empl;
	}

	@Override
	//Deleting Employee detail from table by using findById() & deletById() method
	public void deleteByIdEmployee( long eId) {
		eRepo.findById(eId).orElseThrow(()-> new EmployeeNotFoundException("Entered Employee Id Is Not Present In the Database"));
		eRepo.deleteById(eId);
	}

}
