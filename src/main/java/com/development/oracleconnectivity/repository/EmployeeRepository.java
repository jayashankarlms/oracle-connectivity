package com.development.oracleconnectivity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.development.oracleconnectivity.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Serializable>{

}
