package com.java.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.springbootbackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Employee save(Employee employee);

}
