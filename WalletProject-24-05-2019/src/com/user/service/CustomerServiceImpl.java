package com.user.service;

import java.sql.ResultSet;
import java.util.Scanner;

import com.user.bean.Customer;
import com.user.dao.CustomerDAO;
import com.user.dao.CustomerDAOImpl;

public class CustomerServiceImpl implements CustomerService {

	CustomerDAO dao = new CustomerDAOImpl();
	Customer customer = new Customer();

	Scanner sc = new Scanner(System.in);

	@Override
	public double checkBalance(long accountNumber) {

		double balance = dao.checkBalance(accountNumber);

		return balance;

	}

	@Override
	public String depositMoney(long accountNumber) {
		String depositString = null;
		System.out.println("Enter amount to deposit ");
		double depositAmount = sc.nextDouble();

		if (depositAmount > 0) {

			depositString = dao.depositMoney(depositAmount, accountNumber);

		} else {
			System.out.println("not possible to deposit this low amount ");
		}
		return depositString;

	}

	@Override
	public String transferMoney(long accountNumber) {
		String insufficientBalance = "Insufficient Balance in your account";
		String moneyTransferredMessage;

		System.out.println("Enter recipient's account number");
		long recipientsAccountNumber = sc.nextLong();

		System.out.println("Enter the money amount to send ");
		double sendAmount = sc.nextDouble();

		if (dao.checkBalance(accountNumber) >= sendAmount) {

			moneyTransferredMessage = dao.transferMoney(accountNumber, recipientsAccountNumber, sendAmount);

		} else {

			return insufficientBalance;

		}

		return moneyTransferredMessage;
	}

	@Override
	public String fetchUserDetails(long accountNumber) {

		String nameOfUser = dao.fetchUserName(accountNumber);
		return nameOfUser;

	}

	

	@Override
	public void fetchUserProfile(long accountNumber) {

		dao.fetchCustomerProfile(accountNumber);

	}

	@Override
	public String createNewAccount() {

		Customer c = new Customer();

		System.out.println("Enter User Name ");
		String newUserName = sc.nextLine();
		c.setCustomerName(newUserName);

		System.out.println("Enter branch Name ");
		String branchName = sc.nextLine();
		c.setBranchName(branchName);

		System.out.println("Enter IFSC code ");
		String ifscCode = sc.nextLine();
		c.setIFSC(ifscCode);

		System.out.println("Enter account type ");
		String accountType = sc.nextLine();
		c.setAccountType(accountType);

		System.out.println("Enter password ");
		String password = sc.nextLine();
		c.setPassword(password);

		String message = dao.createNewAccount(c);
		return message;

	}

	@Override
	public String withdraw(long accountNumber) {

		String insufficientBalance = "Insufficient Balance in your account";
		String moneyWithdrawalMessage = "Money is deducted from your account ";

		System.out.println("Enter the money amount to withdraw ");
		double withdrwAmount = sc.nextDouble();

		if (dao.checkBalance(accountNumber) >= withdrwAmount) {

			moneyWithdrawalMessage = dao.withdrawMoney(accountNumber, withdrwAmount);

		} else {

			return insufficientBalance;

		}

		return moneyWithdrawalMessage;

	}

	@Override
	public boolean checkValidation(long accountNumber, String password) {
		
		if(dao.checkAuthetication(accountNumber,password)){
			
			return true;
		}
		return false;
	}

	@Override
	public ResultSet transactions(long accountNumber) {
		
		ResultSet rs= dao.checkTransactions(accountNumber);
		
		return rs;
	}

	

}
