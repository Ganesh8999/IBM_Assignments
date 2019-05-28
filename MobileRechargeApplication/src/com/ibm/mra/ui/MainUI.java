
package com.ibm.mra.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.ibm.mra.beans.Account;
import com.ibm.mra.service.AccountService;
import com.ibm.mra.service.AccountServiceImpl;

public class MainUI {

	static Scanner sc = new Scanner(System.in);
	AccountService service = new AccountServiceImpl();
	String again;
	static int input;
	double amount;

	public static void main(String[] args) {

		MainUI ui = new MainUI();

		System.out.println("1. Check balance \n 2. Recharge Account \n 3.Exit");

		try {
			input = sc.nextInt();
			sc.nextLine();
		} catch (InputMismatchException e) {
			sc.nextLine();
			System.out.println("Only numbers allowed");
			main(args);

		}
		if (input == 1) {

			double balance = ui.checkBalance();
			System.out.println("Balance is " + balance);
			main(args);

		} else if (input == 2) {

			ui.rechargeAccount();

		} else if (input == 3) {

			System.out.println("Thanks");
			System.exit(0);
		} else if (input > 3 || input < 0) {

			System.out.println("Please choose correct option");
			main(args);
		}
	}

	private int rechargeAccount() {

		do {

			System.out.println("Welcome to JIO");
			System.out.println("Enter Mobile No");

			String mobileNo = sc.nextLine();
			if (mobileNo.length() != 10) {
				System.out.println("Mobile no shold be 10 digit");
				new MainUI().rechargeAccount();
			}

			try {
				System.out.println("Enter the amt ");
				amount = sc.nextDouble();
				sc.nextLine();
				if (amount < 0) {

					System.out.println("Recharge not possible with negative amount ");
					new MainUI().rechargeAccount();
				}
			} catch (InputMismatchException e) {

				System.out.println("Only numbers allowed ");
				new MainUI().rechargeAccount();
				sc.nextLine();

			}

			Account ac = service.getAccountDetails(mobileNo);
			if (ac != null) {

				int yes = service.rechargeAccount(mobileNo, ac.getAccountType(), ac.getCustomerName(),
						(ac.getAccountBalance() + amount));

				if (yes == 0) {
					System.out.println("Cannot recharge Account does not exist");
				} else {
					System.out.println(
							"Hello " + ac.getCustomerName() + " new balance is " + (ac.getAccountBalance() + amount));
					System.out.println("Recharge successfull");
				}
			} else {
				System.out.println("Sorry Given account ID does not exist");
			}

			System.out.println("Do you want exit the program press Y  ");
			String exit = sc.nextLine();
			if (exit.equalsIgnoreCase("y")) {
				System.out.println("Thanks !!!!!");
				System.exit(0);
			}
			System.out.println("Do you want try again press Y");

			again = sc.nextLine();

		} while (again.equalsIgnoreCase("y"));
		return 0;

	}

	private double checkBalance() {
		double accountBalance = 0;

		do {

			System.out.println("Welcome to JIO");
			System.out.println("Enter Mobile No");
			String mobileNo = sc.nextLine();
			if (mobileNo.length() != 10) {
				System.out.println("Mobile no shold be 10 digit");
				new MainUI().checkBalance();
			}

			Account ac = service.getAccountDetails(mobileNo);

			if (ac != null) {

				accountBalance = ac.getAccountBalance();
				System.out.println("Your account balance " + accountBalance);
			} else {
				System.out.println("Sorry Given account ID does not exist");
			}

			System.out.println("Do you want try again press Y");
			again = sc.nextLine();

		} while (again.equalsIgnoreCase("y"));
		return accountBalance;

	}

}
