package com.meritamerica.assignment4;

public class CheckingAccount extends AccountHolder {

	
	double openingBalance;
	String checkingAccount;
	
	public void CheckingAccount() {
		
	}
	
	public void CheckingAccount(double openingBalance, String checkingAccount ) {
		
		this.openingBalance = openingBalance;
		this.checkingAccount = checkingAccount;
			
	}

	@Override
	public String toString() {
		return "CheckingAccount [openingBalance=" + openingBalance + ", checkingAccount=" + checkingAccount + "]";
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(String checkingAccount) {
		this.checkingAccount = checkingAccount;
	}
	// down below is the method write in the code to connect with those exception class
	
	String addCheckingAccount(double openingBalance) throws ExceedsCombinedBalanceLimitException{
		return checkingAccount;
		
// this method is for if combined balance limit exceed also add a deposit 
	
	
	}
	
	
	CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) throws ExceedsCombinedBalanceLimitException{
		return checkingAccount;
		
		//  this method is for if combined balance limit exceed also add a deposit 
		
		
	}
	
	
	
	
	
	
	
}
