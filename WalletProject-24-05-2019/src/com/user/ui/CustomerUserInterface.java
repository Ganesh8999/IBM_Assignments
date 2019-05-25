package com.user.ui;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.user.bean.Customer;
import com.user.service.CustomerService;
import com.user.service.CustomerServiceImpl;

public class CustomerUserInterface {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		CustomerUserInterface cui = new CustomerUserInterface();
		cui.start();

	}

	public void start() {

		int input = 0;
		Customer customer = new Customer();
		String again = null;
		long accountNumber = 0;
		String password = "";
		int choice = 1;

		CustomerService customerSerice = new CustomerServiceImpl();

		do {

			System.out.println("1. Existing User \n 2. New User ");
			try {
				input = sc.nextInt();
				sc.nextLine();
				if (input == 2) {

					String account = customerSerice.createNewAccount();
					System.out.println(account);
					
				} else if (input == 1) {

					try {
						System.out.println("Welcome To The HDFC bank");
						System.out.println("Enter  Account Number ");

						accountNumber = sc.nextLong();
						sc.nextLine();

						System.out.println("Enter Password ");
						password = sc.nextLine();

						enterToMenu(accountNumber, password);

					} catch (InputMismatchException ime) {

						System.out.println("Account number 6 digit and only number");
						sc.next();
						new CustomerUserInterface().start();

					}
					
				}
			} catch (InputMismatchException e) {

				System.out.println("Chhose correct option ");
				new CustomerUserInterface().start();
			}

			System.out.println("Do you want again process ? press y");
			again = sc.nextLine();

		} while (again.equalsIgnoreCase("y"));
	}

	public static void enterToMenu(long accountNumber, String password) {

		CustomerService customerSerice = new CustomerServiceImpl();
		int choice = 1;

		if (customerSerice.checkValidation(accountNumber, password)) {

			System.out.println("Welcome  " + customerSerice.fetchUserDetails(accountNumber));

			System.out.println("What would you like to do ?");
			try {
				System.out.println(
						"1. Check Balance  \n 2. Deposit Money \n 3. Transfer Money \n 4.Check Profile \n 5. Transactions \n 6.Withdraw \n 7. Log out");
				choice = sc.nextInt();
				// sc.nextLine();
				if (choice < 1 || choice > 7) {
					System.out.println("Please enter correct number ");
					CustomerUserInterface.enterToMenu(accountNumber, password);
				}

			} catch (InputMismatchException ime) {

				System.out.println("Please choose correct option");
				sc.next();
				enterToMenu(accountNumber, password);
			}
			sc.nextLine();

			switch (choice) {
			case 1:
				double balance = customerSerice.checkBalance(accountNumber);
				System.out.println("Your balance is " + balance);
				CustomerUserInterface.enterToMenu(accountNumber, password);

				break;
			case 2:
				String deposited = customerSerice.depositMoney(accountNumber);
				System.out.println(deposited);
				CustomerUserInterface.enterToMenu(accountNumber, password);
				;

				break;
			case 3:
				String transfferredMoney = customerSerice.transferMoney(accountNumber);
				System.out.println(transfferredMoney);
				CustomerUserInterface.enterToMenu(accountNumber, password);
				break;

			case 4:
				customerSerice.fetchUserProfile(accountNumber);
				CustomerUserInterface.enterToMenu(accountNumber, password);

				break;
			case 5:
				ResultSet rs = customerSerice.transactions(accountNumber);
				ResultSetMetaData rsmd;
				int columnsNumber = 0;
				try {
					rsmd = rs.getMetaData();
					columnsNumber = rsmd.getColumnCount();

					for (int j = 1; j <= columnsNumber; j++) {
						System.out.print(rsmd.getColumnName(j) + " | ");

					}
					System.out.println("");
					System.out.println("");
					while (rs.next()) {

						for (int i = 1; i <= columnsNumber; i++) {
							if (i > 1)

								System.out.print("  |  ");

							System.out.print(rs.getString(i));
						}
						System.out.println("");
						System.out.println();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				CustomerUserInterface.enterToMenu(accountNumber, password);
				;
				break;
			case 6:
				String withdraw = customerSerice.withdraw(accountNumber);
				System.out.println(withdraw);
				CustomerUserInterface.enterToMenu(accountNumber, password);
				
				break;
				
			case 7:
				System.out.println("Do you want to log out ? press Y ");
				String logOut = sc.nextLine();
				if(logOut.equalsIgnoreCase("y")) {
					System.out.println("Thanks for using wallet !! ");
					System.exit(0);
				}else {
					enterToMenu(accountNumber, password);
				}
					
				
				break;
			default:
				break;
			}

		}else{

			System.out.println("Data cannot fetched because Account Number or password wrong try again  ");
			new CustomerUserInterface().start();
		}
	}
}
