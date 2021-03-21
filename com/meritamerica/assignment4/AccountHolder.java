package com.meritamerica.assignment4;

public class AccountHolder {

//	 key words:  account number, SSN, initial deposit, withdraw, transfer amount, interest rate, deposit, 
	
	// 
	public double AccountNumber;
	public String FirstName;
    public 	String MiddleName;
	public String LastName;
     public String SSN;
	public int NumberOfCDAccounts;
    public int NumberOfCheckingAccounts;
    public	int NumberOfSavingsAccounts ;
	public double CDOffering;
	public String FirstOffering;
	public String SecondOffering ;
	public String ThirdOffering ;
	public int accountholder;
	
	
	
	
	
	
	public void AccounHolder() {
		 
	 }
	

	public void AccountHolder(double AccountNumber, String FirstName, double CDOffering,	int accountholder, String MiddleName,  String LastName, String SSN,int NumberOfCDAccounts, int NumberOfCheckingAccounts,	int NumberOfSavingsAccounts ) {
	
	this.AccountNumber = AccountNumber;
	this.FirstName=FirstName;
	this.LastName=LastName;
	this.MiddleName=MiddleName;
	this.SSN=SSN;
	this.NumberOfCDAccounts=NumberOfCDAccounts;
	this. NumberOfCheckingAccounts= NumberOfCheckingAccounts;
	this.NumberOfSavingsAccounts=NumberOfSavingsAccounts;
	this.CDOffering = CDOffering;
	this.accountholder = accountholder;
	 }
	
    

	
	
	

@Override
	public String toString() {
		return "AccountHolder [AccountNumber=" + AccountNumber + ", FirstName=" + FirstName + ", MiddleName="
				+ MiddleName + ", LastName=" + LastName + ", SSN=" + SSN + ", NumberOfCDAccounts=" + NumberOfCDAccounts
				+ ", NumberOfCheckingAccounts=" + NumberOfCheckingAccounts + ", NumberOfSavingsAccounts="
				+ NumberOfSavingsAccounts + ", CDOffering=" + CDOffering + ", FirstOffering=" + FirstOffering
				+ ", SecondOffering=" + SecondOffering + ", ThirdOffering=" + ThirdOffering + ", accountholder="
				+ accountholder + "]";
	}


public int getAccountholder() {
		return accountholder;
	}


	public void setAccountholder(int accountholder) {
		this.accountholder = accountholder;
	}


public double getAccountNumber() {
	return AccountNumber;
}

public void setAccountNumber(double accountNumber) {
	AccountNumber = accountNumber;
}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getMiddleName() {
	return MiddleName;
}

public void setMiddleName(String middleName) {
	MiddleName = middleName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}

public String getSSN() {
	return SSN;
}

public void setSSN(String sSN) {
	SSN = sSN;
}

public int getNumberOfCDAccounts() {
	return NumberOfCDAccounts;
}

public void setNumberOfCDAccounts(int numberOfCDAccounts) {
	NumberOfCDAccounts = numberOfCDAccounts;
}

public int getNumberOfCheckingAccounts() {
	return NumberOfCheckingAccounts;
}

public void setNumberOfCheckingAccounts(int numberOfCheckingAccounts) {
	NumberOfCheckingAccounts = numberOfCheckingAccounts;
}

public int getNumberOfSavingsAccounts() {
	return NumberOfSavingsAccounts;
}

public void setNumberOfSavingsAccounts(int numberOfSavingsAccounts) {
	NumberOfSavingsAccounts = numberOfSavingsAccounts;
}

public double getCDOffering() {
	return CDOffering;
}

public void setCDOffering(double cDOffering) {
	CDOffering = cDOffering;
}




public CheckingAccount addCheckingAccount(int i) {
	// TODO Auto-generated method stub
	return null;
}

public SavingAccount addSavingsAccount(int i) {
	// TODO Auto-generated method stub
	return null;
}

public CDAccount addCDAccount(String cdOffering, int i) {
	// TODO Auto-generated method stub
	return null;
} 

}