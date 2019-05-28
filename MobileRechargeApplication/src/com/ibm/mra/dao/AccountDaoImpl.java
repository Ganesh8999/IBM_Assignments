package com.ibm.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.ibm.mra.beans.Account;

public class AccountDaoImpl implements AccountDao {

	static Map<String, Account> accountEntry = new HashMap<>();

	public AccountDaoImpl() {
		
		accountEntry.put("9999999999", new Account("Prepaid", "Vaishali", 200));
		accountEntry.put("9010210131", new Account("Prepaid", "Vaishali", 200));
		accountEntry.put("9823920123", new Account("Prepaid", "Megha", 453));
		accountEntry.put("9932012345", new Account("Prepaid", "Vikas", 631));
		accountEntry.put("9010210131", new Account("Prepaid", "Anju", 521));
		accountEntry.put("9010210131", new Account("Prepaid", "Tushar", 632));

	}

	@Override
	public Account getAccountDetails(String mobileNo) {

		Account ac = accountEntry.get(mobileNo.trim());
		
		return ac;

	}

	@Override
	public int rechargeAccount(String mobileNo, String accountType, String customerName, double amount) {
		int done = 0;
		Account ac = null;
	    
		if(ac != accountEntry.get(mobileNo)) {
			 accountEntry.put(mobileNo, new Account(accountType, customerName, amount));
				done = 1;
		}
		
		return done ;
	}

	
}
