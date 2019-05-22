package com.ibm.eis.dao;

import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface EmployeeDAO {

	void storeIntoMap(Integer iD, Employee employee);

	Map<Integer, Employee> displayEmployee();

	void searchEmployeeByID(int ID);

	public void searchEmployeeSchemesByID(int empID);

	boolean checkAlreadyAvailable(Integer empID);

}
