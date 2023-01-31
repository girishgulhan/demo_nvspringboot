package com.example.demo_nvspringboot.service;


import java.util.List;

import com.example.demo_nvspringboot.entity.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee emp);

	List<Employee> getAllEmployees();

}
