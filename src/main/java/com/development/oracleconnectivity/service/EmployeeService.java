package com.development.oracleconnectivity.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.development.oracleconnectivity.entity.Employee;

@Component
public interface EmployeeService {
	public boolean saveEmployee(Employee emp);

	public List<Employee> findAllEmployees();

	public Employee findEmployeeById(int id);

	public void deleteEmployeeById(int id);

}
