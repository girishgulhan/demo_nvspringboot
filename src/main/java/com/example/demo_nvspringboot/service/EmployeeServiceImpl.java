package com.example.demo_nvspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_nvspringboot.entity.Employee;
import com.example.demo_nvspringboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
  @Autowired
  private EmployeeRepository empRepo;
  
  @Override
  public Employee saveEmployee(Employee emp) {
	  Employee saveEmp=empRepo.save(emp);
	  return saveEmp;
  }

@Override
public List<Employee> getAllEmployees() {
	List<Employee> employees =empRepo.findAll();
	return employees;
}
}
