package com.development.oracleconnectivity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.development.oracleconnectivity.entity.Employee;
import com.development.oracleconnectivity.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public boolean saveEmployee(Employee emp) {
		Employee employee = repo.save(emp);
		return (employee != null);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return (List<Employee>)repo.findAll();
	}
	
	@Override
	public Employee findEmployeeById(int id) {
		return repo.findById(id).orElse(new Employee());
	}
	
	@Override
	public void deleteEmployeeById(int id) {
		repo.deleteById(id);
	}

}
