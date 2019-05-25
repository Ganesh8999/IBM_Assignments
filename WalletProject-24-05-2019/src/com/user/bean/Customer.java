package com.user.bean;

public class Customer {

	
	private long accountNumber;
	private String customerName;
	private String IFSC;
	private String branchName;
	private String accountType;
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
 
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Customer [accountNumber=" + accountNumber + ", customerName=" + customerName + ", IFSC=" + IFSC
				+ ", branchName=" + branchName + ", accountType=" + accountType + "]";
	}

	public Customer() {
		
	}

	public Customer(long accountNumber, String customerName, String iFSC, String branchName, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		IFSC = iFSC;
		this.branchName = branchName;
		this.accountType = accountType;
	}
	
}
