package com.sample.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo.mappers.EmployeeMappers;
import com.sample.demo.vo.Criteria;
import com.sample.demo.vo.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeMappers employeeMappers;
	
	public List<Employee> fetchEmployees(Criteria c) {
		List<Employee> employees = employeeMappers.fetchEmployees(c);
		if(employees.isEmpty()) {
			System.out.println("조회결과없음");
		}
		return employees;
	}
}
