package com.anudip.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.jpa.entity.Employee;

//JpaRepository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
