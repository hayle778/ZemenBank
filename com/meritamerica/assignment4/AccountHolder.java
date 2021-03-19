package com.meritamerica.assignment4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class AccountHolder {

//	 key words:  account number, SSN, initial deposit, withdraw, transfer amount, interest rate, deposit, 
	
	// 
	
	String FirstName;
	String MiddleName;
	String LastName;
	String SSN;
	int NumberOfCDAccounts;
	int NumberOfCheckingAccounts;
	int NumberOfSavingsAccounts ;
	
	 public AccountHolder(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	public void AccounHolder() {
		 
	 }
	
public void AccounHolder(String FirstName, 	String MiddleName,  String LastName, String SSN,int NumberOfCDAccounts, int NumberOfCheckingAccounts,	int NumberOfSavingsAccounts ) {
	
	this.FirstName=FirstName;
	this.LastName=LastName;
	this.MiddleName=MiddleName;
	this.SSN=SSN;
	this.NumberOfCDAccounts=NumberOfCDAccounts;
	this. NumberOfCheckingAccounts= NumberOfCheckingAccounts;
	this.NumberOfSavingsAccounts=NumberOfSavingsAccounts;
	
	
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

@Override
public String toString() {
	return "AccountHolder [FirstName=" + FirstName + ", MiddleName=" + MiddleName + ", LastName=" + LastName + ", SSN="
			+ SSN + ", NumberOfCDAccounts=" + NumberOfCDAccounts + ", NumberOfCheckingAccounts="
			+ NumberOfCheckingAccounts + ", NumberOfSavingsAccounts=" + NumberOfSavingsAccounts + "]";
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
      
      
  /*    protected ArrayList<CDAccount> CDAccount = new ArrayList<>();
	    
	    private ArrayList<CDOffering> CDOffering  = new ArrayList<>();
	    
	    private ArrayList<SavingAccount> SavingAccount = new ArrayList<>();
	    
	    private ArrayList<CheckingAccount> CheckingAccount = new ArrayList<>();



	
public AccountHolder(String cdaccount, String cdoffering, String savingaccount, String checkingaccount) {
			// TODO Auto-generated constructor stub
		}



public void CDAccount () {
		
	CDAccount cdaccount = new CDAccount();
	//	cdaccount.addCDAccount(cdaccount)cdaccount;
	
	cdaccount.add(11);
	cdaccount.add(3);
	}
	
	
	
public void CDOffering () {
	CDOffering cdoffering = new CDOffering();
    cdoffering.CDAccount("1,0.018");	
    cdoffering.CDAccount("3,0.019");
    cdoffering.CDAccount("5,0.02");


}


public void SavingAccount () throws ExceedsCombinedBalanceLimitException {

	SavingAccount savingaccount = new SavingAccount();

	savingaccount.addSavingAccount(2);
	savingaccount.addSavingAccount(10000);
	
    savingaccount.addSavingAccount("0.01,01/02/2020");

}



public void CheckingAccount () throws ExceedsCombinedBalanceLimitException {
	CheckingAccount checkingaccount = new CheckingAccount();
	
	
	   checkingaccount.addCheckingAccount(1000.0);
	checkingaccount.addCheckingAccount("1,1000,0.0001,01/01/2020");

 
}

*/


	
	
}
