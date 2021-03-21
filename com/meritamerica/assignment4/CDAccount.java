package com.meritamerica.assignment4;


    //Since I add the CDOffering as a parameter it will read it as a instance variable since you instantiate it
public class CDAccount extends AccountHolder{

	
	    public CDAccount(String string, String string2, String string3, String string4) {
		//super(string, string2, string3, string4);
		// TODO Auto-generated constructor stub
	}


		double OpeningBalance;
	    CDOffering offering; 

	    public void CDAccount() {}
	
	

	    public void CDAccount( double OpeningBalance,CDOffering offering ) {
	
	this.OpeningBalance=OpeningBalance;
	this. offering= offering;
 
	
}



		public double getOpeningBalance() {
			return OpeningBalance;
		}



		public void setOpeningBalance(double openingBalance) {
			OpeningBalance = openingBalance;
		}



		public CDOffering getOffering() {
			return offering;
		}



		public void setOffering(CDOffering offering) {
			this.offering = offering;
		}


		
		void addCDAccount(CDOffering offering, double openingBalance) {
			
			// It is void return for now
			// THE RETURN MIGHT CHANGE
			
	// this method is for if combined balance limit exceed also add a deposit 
			
			//  this method is for if combined balance limit exceed also add a deposit 
		
		}
		
		
	CDAccount addCDAccount(CDAccount cdAccount) {
			return cdAccount;
			 
			
			//Should also add a deposit transaction with the opening balance
	
		}
		
		







}