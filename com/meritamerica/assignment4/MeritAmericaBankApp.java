package com.meritamerica.assignment4;

import java.awt.List;
import java.sql.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MeritAmericaBankApp {
	//private static MeritBank MeritBank;

	
	public static void main(String[] args) {
		MeritBank.readFromFile("src/test/testMeritBank_good.txt");

      
	
		
	   AccountHolder account = new AccountHolder();
           
	 
		 
	     account.AccountNumber = 11;
            account.CDOffering = 3;
            account.FirstName ="Doe";
	        account.MiddleName= "";
	        account.LastName = "John";
	        account.SSN ="1234567890";
	        account.accountholder = 2;
		   
	        System.out.print(account);
	        
           
		   
		   CDOffering cdoffering = new CDOffering();

           
            cdoffering. FirstOffering = "1, 0.018";
			cdoffering.SecondOffering = "3, 0.019" ;
			cdoffering.ThirdOffering = "5, 0.02" ;
			
			
			System.out.println(cdoffering);
           
	        
	       
			CheckingAccount check = new CheckingAccount();
	        
	        check.checkingAccount = "1,10000,0.0001,01/01/2020";
	        check.openingBalance = 4;
	      
	         System.out.print(check);
	        
	        
	       SavingAccount saving = new SavingAccount();
	        
	        saving.savingAccount ="2,10000,0.0001,01/01/2020";
	        saving.openingBalance = 3;
	     
            System.out.println(saving);

	
            
	
	}



}