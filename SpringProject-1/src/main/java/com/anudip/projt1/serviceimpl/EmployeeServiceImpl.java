package com.anudip.projt1.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anudip.projt1.entity.Employee;
import com.anudip.projt1.repository.EmployeeRepository;
import com.anudip.projt1.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository emplRepo;
	
	public EmployeeServiceImpl(EmployeeRepository emplRepo) {
		super();
		this.emplRepo = emplRepo;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return emplRepo.findAll();
	}

	@Override
	public Employee saveEmployee(Employee empl) {
		return emplRepo.save(empl);
	}

	@Override
	public Employee getEmployeebyID(Long id) {
		return emplRepo.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee empl) {
		return emplRepo.save(empl);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		emplRepo.deleteById(id);
	}

}
