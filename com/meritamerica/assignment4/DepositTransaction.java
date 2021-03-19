package com.meritamerica.assignment4;

public abstract class DepositTransaction extends Transaction {

public String BankAccountTargetAccount;
public double amount;  //small letter amount for separating the child class amount

public void DepositTransaction() {
	
}

public void DepositTransaction(String BankAccountTargetAccount, double amount) {
	
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
	return "DepositTransaction [BankAccountTargetAccount=" + BankAccountTargetAccount + ", amount=" + amount + "]";
}

}
