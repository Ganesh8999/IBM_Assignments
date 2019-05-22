package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface EmployeeService {

	void storeIntoMap(Integer employeeID, Employee employee);

	String checkScheme(Double salary);

	Map<Integer, Employee> displayEmployee();

	String checkDesignation(Double salary);

	void searchEmployeeByID(int ID);

	void searchEmployeeSchemesByID(int empID);

	boolean checkAlreadyAvailable(Integer empID);

}
