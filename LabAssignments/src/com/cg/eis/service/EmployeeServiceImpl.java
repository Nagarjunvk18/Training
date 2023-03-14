package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	// Overriding the findInsuranceScheme method
	@Override
	public void findInsuranceScheme(Employee employee) {
		// Insurance scheme selection based on salary and designation
		if (employee.getSalary() < 5000 && employee.getDesignation().equals("Clerk")) {
			employee.setInsuranceScheme("No Scheme");
		} else if (employee.getSalary() < 20000 && employee.getDesignation().equals("System Associate")) {
			employee.setInsuranceScheme("Scheme C");
		} else if (employee.getSalary() < 40000 && employee.getDesignation().equals("Programmer")) {
			employee.setInsuranceScheme("Scheme B");
		} else if (employee.getDesignation().equals("Manager")) {
			employee.setInsuranceScheme("Scheme A");
		}
	}
}
