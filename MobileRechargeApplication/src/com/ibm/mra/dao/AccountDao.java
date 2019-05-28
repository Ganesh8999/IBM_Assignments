package com.ibm.mra.dao;

import com.ibm.mra.beans.Account;

public interface AccountDao {

	
	Account getAccountDetails(String mobileNo);
	
	

	int rechargeAccount(String mobileNo, String accountType, String customerName, double amount);
}
