package com.meritamerica.assignment4;

import java.util.List;

public class MeritBank {

	public static void main(String[]args) {
	
	}
	

	// Math.pow();<----should now call the recursive method.
	// when computing the future value use java recursion than Math.pow()

	  // use jAVA RECURSIVE for finding sequential value. Modify down below
	    /*public class Res{

	    public static void main(String[]args) {

	                recursionSum(6);
	    }

	public static void recursionSum(  int h){
	        if(h==0 ){
	            System.out.println("Stop!");

	        }
	else{
	            System.out.println(h);
	            h--;
	    
	    recursionSum(h);

	        }

	    }

*/

	public static double recursiveFutureValue(double amount, int years, double interestRate) {
		
		
		return interestRate;
	}
	
	public static boolean processTransaction(Transaction transaction)throws NegativeAmountException, ExceedsAvailableBalanceException,ExceedsFraudSuspicionLimitException{
		return false; //fix the return statment
	
}
	//
	// if transaction does not violate any constraint withdraw a value from a 
	//bank account and add the transaction to the relvant bank account
	//if the transaction vilote any of the constraints(negative amount to exceede available balance the relvant exception should be thrown
	// the process should be terminated
	//if the transaction vilotes the 1000 suspicion limit should simply add to fraudqueue
	
	
	// readFromFile method takes the string parameter to the the main method of MeritAmericaBankApp

	public static FraudQueue getFraudQueue() {
		
		return null;  //this needs a return to the merit americaBankapp
		
		
		}
	
	//public static BankAccount getBankaccount(long accountId)
	
	//<BankAccount> is the added parameter by the SpringTool4
	
	public static  <BankAccount> BankAccount getBankAccount(long accountId) {
		
	return null; // if account not found
	
	
	}
			
	public static void readFromFile(String string) {
		// TODO Auto-generated method stub
		
	}

	
	public void addTransaction	(Transaction transaction) {

		
		
}
	
	
	public List <Transaction> getTransaction(){
		return null;  //add the return statment
		
	}
	
	
	//String fileName;
	
	static boolean readFromFile2(String fileName) {
		return false;// you might change the return value
		
	// should also read BankAccountTransaction and the fraudQueue
	
	}

	static boolean writeToFile(String fileName) {
		return false;  // you might change the return value
		
	
	// should also write Bankaccount transactions and FraudQueue
	
	
	}
	
	
	
}

