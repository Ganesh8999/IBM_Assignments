package com.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.user.bean.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	PreparedStatement ps;
	PreparedStatement ps2;
	PreparedStatement ps3;
	Connection con;
	Statement stmt;

	public Connection createDatabaseConnection() {
		Connection con = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database2", "root", "");

			if (con != null) {

				System.out.println("Connection established ");

			} else {

				System.out.println("Sorry Some issues try later....");
			}

		} catch (ClassNotFoundException | SQLException e) {

			System.out.println("Some issues ..........");

		}
		return con;

	}

	@Override
	public double checkBalance(long accountNumber) {

		con = new CustomerDAOImpl().createDatabaseConnection();
		if (con != null)
			System.out.println("Fetching your data...");
		double balance = 0;

		String fetchUserDetails = "SELECT BALANCE FROM customerinfo WHERE account_No = ?";

		try {
			ps = con.prepareStatement(fetchUserDetails);
			ps.setLong(1, accountNumber);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				balance = rs.getDouble(1);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return balance;

	}

	@Override
	public String depositMoney(double depositAmount, long accountNumber) {

		con = new CustomerDAOImpl().createDatabaseConnection();
		if (con != null)
			System.out.println("CustomerDAOImpl.depositMoney()");
		double newBalance = (double) (depositAmount + (new CustomerDAOImpl().checkBalance(accountNumber)));
		
		String depositBalance = "UPDATE  customerinfo SET BALANCE= ?   WHERE account_No = ?";
		String depositTrackForTransaction = "INSERT INTO transactions (account_No,description,deposit,balance) values(?,?,?,?)";
		String message = null;

		try {
			ps = con.prepareStatement(depositBalance);
			ps.setDouble(1, newBalance);
			ps.setLong(2, accountNumber);
			
			ps2 = con.prepareStatement(depositTrackForTransaction);
			
			ps2.setLong(1, accountNumber);
			ps2.setString(2, "DEPOSITMUMBAI");
			ps2.setDouble(3,depositAmount);
			ps2.setDouble(4, newBalance);

			if (ps.executeUpdate() > 0 && ps2.executeUpdate() > 0) {

				message = "balance updated";
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return message;

	}

	@Override
	public String transferMoney(long accountNumber, long recpientsAccountNumber, double sendAmount) {

		con = new CustomerDAOImpl().createDatabaseConnection();
		if (con != null)
			System.out.println("CustomerDAOImpl.transferMoney()");

		double updatedBalanceOfSendingUser = ((double) ((new CustomerDAOImpl().checkBalance(accountNumber)
				- sendAmount)));
		double updatedBalanceOfRecipient = ((double) ((new CustomerDAOImpl().checkBalance(recpientsAccountNumber)
				+ sendAmount)));

		String afterTransferUpdateBalance = "UPDATE  customerinfo SET BALANCE= ?   WHERE account_No = ?";
		String transferTrackForTransaction = "INSERT INTO transactions (account_No,description,withdrawal,balance,paid_To) values(?,?,?,?,?)";
		String message = null;

		try {
			ps = con.prepareStatement(afterTransferUpdateBalance);
			ps.setDouble(1, updatedBalanceOfSendingUser);
			ps.setLong(2, accountNumber);

			ps2 = con.prepareStatement(afterTransferUpdateBalance);
			ps2.setDouble(1, updatedBalanceOfRecipient);
			ps2.setLong(2, recpientsAccountNumber);
			
			ps3 = con.prepareStatement(transferTrackForTransaction);
			ps3.setLong(1, accountNumber);
			ps3.setString(2, "Transfer By Wallet");
			ps3.setDouble(3, sendAmount);
			ps3.setDouble(4, updatedBalanceOfSendingUser);
			ps3.setLong(5, recpientsAccountNumber);
			

			if ((ps.executeUpdate() > 0) && (ps2.executeUpdate() > 0 && ps3.executeUpdate() > 0)) {

				message = "balance transferred";
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return message;
	}

	@Override
	public String fetchUserName(long accountNumber) {

		con = new CustomerDAOImpl().createDatabaseConnection();
		if (con != null)
			System.out.println("Fetching your data...");
		String name = null;

		String fetchUserName = "SELECT user_Name FROM customerinfo WHERE account_No = ?";

		try {
			ps = con.prepareStatement(fetchUserName);
			ps.setLong(1, accountNumber);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				name = rs.getString(1);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return name;

	}

	@Override
	public void fetchCustomerProfile(long accountNumber) {
		con = new CustomerDAOImpl().createDatabaseConnection();
		if (con != null)
			System.out.println("Fetching your data...");

		String fetchUserProfile = "SELECT * FROM customerinfo WHERE account_No = ?";

		try {
			ps = con.prepareStatement(fetchUserProfile);
			ps.setLong(1, accountNumber);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("CustomerDAOImpl.fetchCustomerProfile()");
				;
				System.out.println("Account Number:-   " + rs.getLong(1) + ",  Name:-  " + rs.getString(2)
						+ ",  Branch:-  " + rs.getString(3));

				System.out.println("IFSC Code:-   " + rs.getString(4) + ", Account Type:-   " + rs.getString(5)
						+ ", Balance:-    " + rs.getDouble(7));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public String createNewAccount(Customer c) {

		String inputQuery = "INSERT INTO customerinfo(account_No,user_Name,branchName,ifscCode,account_Type,password,balance) values(?,?,?,?,?,?,?)";
		String message=null;
		con = new CustomerDAOImpl().createDatabaseConnection();
		if (con != null)
			System.out.println("Fetching your data...");

		try {
			ps = con.prepareStatement(inputQuery);
			ps.setLong(1, c.getAccountNumber());
			ps.setString(2, c.getCustomerName());
			ps.setString(3, c.getBranchName());
			ps.setString(4, c.getIFSC());
			ps.setString(5, c.getAccountType());
			ps.setString(6, c.getPassword());
			ps.setDouble(7, 0);
			int rs = ps.executeUpdate();
			if (rs > 0) {
				message = "Thanks Account created !!";
			}
			else {
				message = "some issues...";
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return message;
	}

	@Override
	public String withdrawMoney(long accountNumber, double withdrwAmount) {
		

		con = new CustomerDAOImpl().createDatabaseConnection();
		if (con != null)
			System.out.println("CustomerDAOImpl.withdrawMoney()");
		double newBalance = (double) ( (new CustomerDAOImpl().checkBalance(accountNumber)- withdrwAmount));

		String withdrawBalance = "UPDATE  customerinfo SET BALANCE= ?   WHERE account_No = ?";
		String withdrawTrackRecord = "INSERT INTO transactions (account_No,description,withdrawal,balance) values(?,?,?,?)";

		String message = null;

		try {
			ps = con.prepareStatement(withdrawBalance);
			ps.setDouble(1, newBalance);
			ps.setLong(2, accountNumber);
			
			ps2 = con.prepareStatement(withdrawTrackRecord);
			ps2.setDouble(1, accountNumber);
			ps2.setString(2, "Withdraw By ATM at Mumbai");
			ps2.setDouble(3,withdrwAmount);
			ps2.setDouble(4, newBalance);
			

			if (ps.executeUpdate() > 0 && ps2.executeUpdate() > 0) {

				message = withdrwAmount+ " balance deducted ";
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return message;
		
		
	}

	@Override
	public boolean checkAuthetication(long accountNumber, String password) {
		
		con = new CustomerDAOImpl().createDatabaseConnection();
		if (con != null)
			
			System.out.println("Fetching your data...");
		boolean flag = false;

		String fetchNameAndPasword = "SELECT account_No,password FROM customerinfo WHERE account_No = ?";

		try {
			ps = con.prepareStatement(fetchNameAndPasword);
			ps.setLong(1, accountNumber);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				long accNo =(long) rs.getLong(1);
				String pwd =(String) rs.getString(2);
				
				if(   (accNo == accountNumber) && (pwd.equals(password) )){
					
					flag =  true;
					
				}else {
					
					flag=  false;
				}
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return flag;
		
	
	}

	@Override
	public ResultSet checkTransactions(long accountNumber) {
		ResultSet rs = null;
		String checkTransactionsQuery = "Select * from transactions where account_No = ?";
		
		try {
			ps = con.prepareStatement(checkTransactionsQuery);
			ps.setLong(1, accountNumber);
			
			 rs = ps.executeQuery();
					
		
	}catch(SQLException sqe) {
			System.out.println("CustomerDAOImpl.checkTransactions()");
	}
		
		return rs;
	}

	

}
