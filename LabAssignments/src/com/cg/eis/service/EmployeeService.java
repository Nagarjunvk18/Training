package com.cg.eis.service;

import com.cg.eis.bean.Employee;

// Interface for employee insurance services
public interface EmployeeService {
	// Method to find insurance scheme for an employee based on salary and
	// designation
	public void findInsuranceScheme(Employee employee);
}

// Implementation class for employee insurance services
