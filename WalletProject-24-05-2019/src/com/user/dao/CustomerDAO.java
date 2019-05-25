package com.user.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.user.bean.Customer;

public interface CustomerDAO {

	public double checkBalance(long accountNumber);
	
	public String depositMoney(double depositAmount, long accountNumber);

	String transferMoney(long accountNumber, long recpientsAccountNumber, double sendAmount);

	String fetchUserName(long accountNumber);
	
	void fetchCustomerProfile(long accountNumber);
	
	String createNewAccount(Customer c);

	public String withdrawMoney(long accountNumber, double withdrwAmount);

	public boolean checkAuthetication(long accountNumber, String password);

	public ResultSet checkTransactions(long accountNumber);
}
