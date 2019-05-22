package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.dao.EmployeeDAO;
import com.ibm.eis.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO dao = new EmployeeDAOImpl();

	@Override
	public void storeIntoMap(Integer ID, Employee employee) {

		dao.storeIntoMap(ID, employee);

	}

	@Override
	public Map<Integer, Employee> displayEmployee() {
		// TODO Auto-generated method stub
		return dao.displayEmployee();
	}

	@Override
	public String checkScheme(Double salary) {

		if (salary < 5000) {
			return "No Scheme";

		} else if (salary > 5000 && salary < 20000) {

			return "Scheme C";

		} else if (salary >= 20000 && salary < 40000) {

			return "Scheme B";
		} else if (salary >= 40000) {
			return "Scheme A ";
		} else {

			return "No scheme";
		}

	}

	@Override
	public String checkDesignation(Double salary) {

		if (salary < 5000) {
			return "Clerk";
		} else if (salary > 5000 && salary < 20000) {

			return " System Associate";

		} else if (salary >= 20000 && salary < 40000) {

			return "Programmer ";
		} else if (salary >= 40000) {
			return "Manager";
		} else {

			return "No desgination";
		}
	}

	@Override
	public void searchEmployeeByID(int ID) {

		dao.searchEmployeeByID(ID);
	}

	@Override
	public void searchEmployeeSchemesByID(int empID) {

		dao.searchEmployeeSchemesByID(empID);

	}

	@Override
	public boolean checkAlreadyAvailable(Integer empID) {

		return dao.checkAlreadyAvailable(empID);
	}

}
