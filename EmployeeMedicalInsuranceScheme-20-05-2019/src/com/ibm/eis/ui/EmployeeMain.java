package com.ibm.eis.ui;

import java.util.Scanner;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.EmployeeService;
import com.ibm.eis.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		EmployeeService service = new EmployeeServiceImpl();
		Employee employee = new Employee();

		String name = null;
		Integer employeeID;
		String insuranceScheme;
		String designation;

		String again;

		do {

			System.out.println("Enter employee ID");
			employeeID = scan.nextInt();
			scan.nextLine();

			System.out.println("enter employee name");
			name = scan.nextLine();

			System.out.println("enter Salary ");
			Double salary = scan.nextDouble();

			insuranceScheme = service.checkScheme(salary);
			designation = service.checkDesignation(salary);

			employee.setId(employeeID);
			employee.setName(name);
			employee.setSalary(salary);
			employee.setDesignation(designation);
			employee.setInsuranceScheme(insuranceScheme);

			if (service.checkAlreadyAvailable(employeeID)) {

				service.storeIntoMap(employeeID, employee);
				System.out.println(service.displayEmployee());

			} else {

				System.out.println(
						"Employee with given ID already exits please enter diff ID duplicates record can't  stored");
			}

			System.out.println("Do you want to add more employess press y");
			again = scan.next();

		} while (again.equalsIgnoreCase("y"));

		System.out.println(service.displayEmployee());

		do {
			System.out.println("For searching employee details enter employee id ");
			System.out.println(" Enter the employee ID");
			int empID = scan.nextInt();
			service.searchEmployeeByID(empID);

			System.out.println("Do you want to find another employee details ? press Y");
			again = scan.nextLine();

		} while (again.equalsIgnoreCase("y"));

		do {

			System.out.println("For searching employee scheme enter employee id ");

			System.out.println(" Enter the employee ID");
			int empID = scan.nextInt();

			service.searchEmployeeSchemesByID(empID);

			System.out.println("Do you want to find another employee scheme ? press Y");
			again = scan.next();

		} while (again.equalsIgnoreCase("y"));
	}

}
