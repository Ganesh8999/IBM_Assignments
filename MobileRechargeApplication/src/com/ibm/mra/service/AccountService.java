package com.ibm.mra.service;

import com.ibm.mra.beans.Account;

public interface AccountService {

	Account getAccountDetails(String mobileNo);
	
	int rechargeAccount(String mobileNo, String accountType, String customerName, double amount);
}
