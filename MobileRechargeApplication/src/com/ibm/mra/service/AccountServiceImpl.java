package com.ibm.mra.service;

import com.ibm.mra.beans.Account;
import com.ibm.mra.dao.AccountDao;
import com.ibm.mra.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {
	
	AccountDao dao = new AccountDaoImpl();

	@Override
	public Account getAccountDetails(String mobileNo) {
		
		
		
		return dao.getAccountDetails(mobileNo);
	}

	

	@Override
	public int rechargeAccount(String mobileNo, String accountType, String customerName, double amount) {
		// TODO Auto-generated method stub
		return dao.rechargeAccount(mobileNo, accountType,customerName,amount);
	}

}
