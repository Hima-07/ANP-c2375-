package com.anudip.projt1.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.anudip.projt1.service.EmployeeService;

import com.anudip.projt1.entity.Employee;

@Controller
public class EmployeeController {
	
	private EmployeeService emplServ;

	public EmployeeController(EmployeeService emplServ) {
		super();
		this.emplServ = emplServ;
	}
	
	//handler method to handle list of Employee and return mode and view
	@GetMapping("/employees")
	public String listOfEmpls(Model model) {
		model.addAttribute("employees",emplServ.getAllEmployees());
		return "employees";
	}
	
	@GetMapping("/employees/create")
	public String createEmployee(Model model) {
		//Create Empty Employee Object to hold Employee form Data
		Employee employee = new Employee();
		model.addAttribute("empl",employee);
		return "create_employees";
	}
	
	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("empl")Employee empl) { 
		emplServ.saveEmployee(empl);
		return "redirect:/employees";
	}
	
	@GetMapping("/employees/edit/{id}")
	public String editEmployee(@PathVariable Long id,Model model) {
		model.addAttribute("employee",emplServ.getEmployeebyID(id));
		return "editEmployees";
	}
	
	@PostMapping("/employees/{id}")
	public String updateEmployee(@PathVariable Long id, @ModelAttribute("empl") Employee empl, Model model) {
		
		//get employee from database by Id
		Employee existingEmpl = emplServ.getEmployeebyID(id);
		existingEmpl.setId(id);
		existingEmpl.setFirstName(empl.getFirstName());
		existingEmpl.setLastName(empl.getLastName());
		existingEmpl.setDepartment(empl.getDepartment());
		existingEmpl.setSalary(empl.getSalary());
		
		//save updated Employee Object
		
		emplServ.updateEmployee(existingEmpl);
		return "redirect:/employees";
	}
	
	//Handler Method by Id
	@GetMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		emplServ.deleteEmployeeById(id);
		return "redirect:/employees";	
	}

}
