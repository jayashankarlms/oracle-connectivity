package com.development.oracleconnectivity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OracleConnectivityApplication{

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(OracleConnectivityApplication.class, args);
//		EmployeeService empService = context.getBean(EmployeeServiceImpl.class);
//		Employee emp = new Employee();
//		emp.setId(1);
//		emp.setEmpName("jay");
//		emp.setEmpSal(1200d);
//		
//		boolean status = empService.saveEmployee(emp);
//		if(status)
//			System.out.println("Data inserted in db");
//		else
//			System.out.println("not inserted in db");
	}

}
