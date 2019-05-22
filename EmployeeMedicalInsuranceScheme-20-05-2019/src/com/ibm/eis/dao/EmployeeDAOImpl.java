package com.ibm.eis.dao;

import java.util.HashMap;
import java.util.Map;

import com.ibm.eis.bean.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private Map<Integer, Employee> employees = new HashMap<Integer, Employee>();

	@Override
	public void storeIntoMap(Integer id, Employee employee) {

		employees.put(id, employee);

	}

	@Override
	public Map<Integer, Employee> displayEmployee() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public void searchEmployeeByID(int ID) {

		System.out.println(employees.get(ID));
		

	}

	@Override
	public void searchEmployeeSchemesByID(int empID) {

		System.out.println(employees.get(empID).getInsuranceScheme());

	}

	@Override
	public boolean checkAlreadyAvailable(Integer empID) {

		if (employees.containsKey(empID)) {
			return true;
		} else {
			return false;
		}
	}
}
