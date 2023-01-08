package com.anudip.projt1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="empl_info")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="first_name",nullable = false,length=15)
	private String firstName;
	@Column(name="last_name",nullable = false,length=15)
	private String lastName;
	@Column(name="empl_dept",nullable = false,length=15)
	private String department;
	@Column(name="empl_salary",nullable = false)
	private int salary;
	
	public Employee() {
		super();
	}
	
	public Employee(String firstName, String lastName, String department, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.salary = salary;
	}
	
	
}
