package com.meritamerica.assignment4;

public class CheckingAccount extends AccountHolder {

	public CheckingAccount(String string, String string2, String string3, String string4) {
		super(string, string2, string3, string4);
		// TODO Auto-generated constructor stub
	}


	double openingBalance;
	CheckingAccount checkingAccount;
	
	public void CheckingAccount() {
		
	}
	
	public void CheckingAccount(double openingBalance, CheckingAccount checkingAccount ) {
		
		this.openingBalance = openingBalance;
		this.checkingAccount = checkingAccount;
			
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}
	// down below is the method write in the code to connect with those exception class
	
	CheckingAccount addCheckingAccount(double openingBalance) throws ExceedsCombinedBalanceLimitException{
		return checkingAccount;
		
// this method is for if combined balance limit exceed also add a deposit 
	
	
	}
	
	
	CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) throws ExceedsCombinedBalanceLimitException{
		return checkingAccount;
		
		//  this method is for if combined balance limit exceed also add a deposit 
		
		
	}
	
	
	
	
	
	
	
}
