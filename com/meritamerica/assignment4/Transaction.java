
package com.meritamerica.assignment4;

	public abstract class Transaction {

	public String BankAccount;
	public String TargetAccount;
	public double Amount;
	public String TransactionDate;
	//public String writeToString;
	//public String Transaction readFromString(String transactionDataString);
//	public abstract void process() throws NegativeAmountException, ExceedsAvailableBalanceException, ExceedsFraudSuspicionLimitException;
	public boolean ProcessesByFraudTeam; 
	public String RejectionReason;


	public void Transaction() {
		
	}


public void Transaction(String BankAccount, String TargetAccount, double Amount, String TransactionDate, boolean ProcessesByFraudTeam, String RejectionReason) {
	
	// this is for pulling the instance variable from the class
	
	this.BankAccount = BankAccount; // the argument after equal is for creating a method after 
    this.TargetAccount = TargetAccount;
    this.Amount = Amount;
    this.TransactionDate = TransactionDate;
    this.ProcessesByFraudTeam = ProcessesByFraudTeam;
    this.RejectionReason= RejectionReason;
	
}


public String getBankAccount() {
	return BankAccount;
}


public void setBankAccount(String bankAccount) {
	BankAccount = bankAccount;
}


public String getTargetAccount() {
	return TargetAccount;
}


public void setTargetAccount(String targetAccount) {
	TargetAccount = targetAccount;
}


public double getAmount() {
	return Amount;
}


public void setAmount(double amount) {
	Amount = amount;  // the first amount is taking to the overload constructor 
}                     // the second amount is for bringing the amount value from the method amount in another class


public String getTransactionDate() {
	return TransactionDate;
}


public void setTransactionDate(String transactionDate) {
	TransactionDate = transactionDate;
}


public boolean isProcessesByFraudTeam() {
	return ProcessesByFraudTeam;
}


public void setProcessesByFraudTeam(boolean isProcessesByFraudTeam) {
	this.ProcessesByFraudTeam = isProcessesByFraudTeam;
}


public String getRejectionReason() {
	return RejectionReason;
}


public void setRejectionReason(String rejectionReason) {
	RejectionReason = rejectionReason;
}


	
	public Static Transaction readFromString(String transactionDataString) {
	
}

	//public String writeToString;
	public String Transaction2 readFromString(String transactionDataString) {
	
	}
	public abstract void process() throws NegativeAmountException, ExceedsAvailableBalanceException, ExceedsFraudSuspicionLimitException{
		
	}

	
	public class DepositTransaction extends Transaction{

		@Override
		public void process()
				throws NegativeAmountException, ExceedsAvailableBalanceException, ExceedsFraudSuspicionLimitException {
			// TODO Auto-generated method stub
			
		}

}

	



















































	









































	






















































































