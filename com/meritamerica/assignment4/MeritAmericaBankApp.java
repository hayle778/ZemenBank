package com.meritamerica.assignment4;

import java.awt.List;
import java.util.ArrayList;

public class MeritAmericaBankApp {
	//private static MeritBank MeritBank;

	public static void main(String[] args) {
		MeritBank.readFromFile("src/test/testMeritBank_good.txt");

	ArrayList<String> bank = new ArrayList<>();
		bank.add("0.01");
	
		
		System.out.println(bank);
		

		
		String FirstName ="DDSS";
		
		AccountHolder account = new AccountHolder("2", "Doe", "John", "1234567890");
            account.addCDAccount("rr", 0);
            account.addCDAccount("rr", 0);
           
            account.addCheckingAccount(0);
        
            account.addCheckingAccount(0);
            account.addCheckingAccount(0);
            
            
            account.addSavingsAccount(0);
            account.addSavingsAccount(0);
            account.addSavingsAccount(0);
         
             System.out.println(account);


	}



}