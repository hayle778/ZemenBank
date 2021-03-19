package com.meritamerica.assignment4;

public abstract class TransferTransaction extends Transaction {

public String BankAccountSourceAccount;
public String BankAccountTargetAccount;
public double amount;



public void TransferTransaction() {
	
}


public void TransferTransaction(String BankAccountSourceAccount, String BankAccountTargetAccount, double amount) {
	
	this.BankAccountSourceAccount = BankAccountSourceAccount;
	this.BankAccountTargetAccount = BankAccountTargetAccount;
	this.amount = amount;
	
}






}
