package com.example.demo_nvspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo_nvspringboot.entity.Employee;
import com.example.demo_nvspringboot.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
	private EmployeeService empServ;

	@PostMapping("/saveEmployee")
	public Employee saveEmploye(@RequestBody Employee emp) {
		Employee saveEmp = empServ.saveEmployee(emp);
		return saveEmp;
	}
	@GetMapping("/allEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> employees = empServ.getAllEmployees();
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
	}

}