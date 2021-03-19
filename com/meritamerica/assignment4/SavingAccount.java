package com.meritamerica.assignment4;

public class SavingAccount extends AccountHolder {

	double openingBalance;
	SavingAccount savingAccount;
	
	public void CheckingAccount() {
		
	}
	
	public void CheckingAccount(double openingBalance, SavingAccount savingAccount ) {
		
		this.openingBalance = openingBalance;
		this.savingAccount = savingAccount;
			
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public SavingAccount getCheckingAccount() {
		return savingAccount;
	}

	public void setCheckingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}
	// down below is the method write in the code to connect with those exception class
	
	SavingAccount addSavingAccount(double openingBalance) throws ExceedsCombinedBalanceLimitException{
		return savingAccount;
		
// this method is for if combined balance limit exceed also add a deposit 
	
	
	}
	
	SavingAccount addSavingAccount(SavingAccount savingAccount) throws ExceedsCombinedBalanceLimitException{
		return savingAccount;
		
		//  this method is for if combined balance limit exceed also add a deposit 
		
		
	}

	@Override
	public String toString() {
		return "SavingAccount [openingBalance=" + openingBalance + ", savingAccount=" + savingAccount + "]";
	}

	public void addSavingAccount(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void readFromString(String string) {
		// TODO Auto-generated method stub
		
	}
	

	
	


}
