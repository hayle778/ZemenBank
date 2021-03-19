package com.meritamerica.assignment4;

public abstract class WithdrawTransaction extends Transaction{

	public String BankAccountTargetAccount;
	public double amount;
	
	public void WithdrawTransaction() {
		
	}


public void WithdrawTransaction(String BankAccountTargetAccount, double amount) {
		this.BankAccountTargetAccount = BankAccountTargetAccount;
		this.amount = amount;
		
}


public String getBankAccountTargetAccount() {
	return BankAccountTargetAccount;
}


public void setBankAccountTargetAccount(String bankAccountTargetAccount) {
	BankAccountTargetAccount = bankAccountTargetAccount;
}


public double getamount() {
	return amount;
}


public void setAmount(double amount) {
	this.amount = amount;
}



@Override
public String toString() {
	return "WithdrawTransaction [BankAccountTargetAccount=" + BankAccountTargetAccount + ", amount=" + amount + "]";
}

}
