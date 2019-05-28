package com.ibm.mra.beans;

public class Account {

	
	private String accountType;
	private String customerName;
	private double accountBalance;
	
	
	public Account() {}
	public Account(String accountType, String customerName, double accountBalance) {
		
		this.accountType = accountType;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCustomerName() {
		return customerName;
	}
	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", customerName=" + customerName + ", accountBalance="
				+ accountBalance + "]";
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public int setAccountBalance(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}
}
