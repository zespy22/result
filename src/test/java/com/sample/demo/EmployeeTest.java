package com.sample.demo;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sample.demo.service.EmployeeService;
import com.sample.demo.vo.Criteria;
import com.sample.demo.vo.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/META-INF/spring/app-context.xml"})
public class EmployeeTest {
	
	@Autowired
	private EmployeeService employee;  
	
	String opt;
	String keyword;
	String phone;
	List<Integer> depts;
	List<Integer> jobId;
	String minSalary;
	String maxSalary;
	String beginDate;
	String endDate;
	
	@Test
	public void testOne () {
		Criteria c = new Criteria();
//		c.setOpt("name");
//		c.setKeyword("Lex");
//		c.setDepts(Arrays.asList(10, 20, 30, 40));
//		c.setJobId(Arrays.asList("AD_PRES", "AD_VP"));
//		c.setMinSalary("15000");
//		c.setMaxSalary("15000");
//		c.setBeginDate("2003-01-01");
		c.setEndDate("2005-01-01");
		
		List<Employee> employees = employee.fetchEmployees(c);
		
		for(Employee e : employees) {
			System.out.println(e);
		}
	}
	
}
