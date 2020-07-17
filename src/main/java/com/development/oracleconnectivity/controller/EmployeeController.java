package com.development.oracleconnectivity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.development.oracleconnectivity.entity.Employee;
import com.development.oracleconnectivity.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/emp-display")
	public String employeeDisplay(ModelMap map) {
		map.addAttribute("employeeList", employeeService.findAllEmployees());
		return "emp_display";
	}
	
	@GetMapping("/add-emp")
	public String displayAddEmployeePage(ModelMap map) {
		map.addAttribute("employee", new Employee(0,"name",100d));
		map.addAttribute("operation", "Add Employees");
		return "emp_details";
	}
	
	@PostMapping("/add-emp")
	public String addEmployee(Employee employee) {
		if(employeeService.saveEmployee(employee))
			return "redirect:/emp-display";
		else
			return "emp_details";
	}
	
	@GetMapping("/update-emp")
	public String displayUpdateEmployeePage(@RequestParam("id") int id, ModelMap map) {
		map.addAttribute("employee", employeeService.findEmployeeById(id));
		return "emp_details";
	}
	
	@PostMapping("/update-emp")
	public String updateEmployee(Employee employee) {
		if(employeeService.saveEmployee(employee))
			return "redirect:/emp-display";
		else
			return "emp_details";
	}
	
	@GetMapping("/delete-emp")
	public String deleteEmployee(int id) {
		employeeService.deleteEmployeeById(id);
		return "redirect:/emp-display";
	}
	
}
