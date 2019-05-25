package com.user.service;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.user.bean.Customer;

public interface CustomerService {

//	public String transactionHistory();
	public double checkBalance(long accountNumber);
	public String depositMoney(long accountNumber);
	public String transferMoney(long accountNumber);
	public String fetchUserDetails(long accountNumber);
	public boolean checkValidation(long accountNumber, String password);
	public void fetchUserProfile(long accountNumber);
	public String createNewAccount();
	public String withdraw(long accountNumber);
	public ResultSet transactions(long accountNumber);
	
}
