package com.anudip.projt1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.projt1.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
