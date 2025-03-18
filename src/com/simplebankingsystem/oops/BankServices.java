package com.simplebankingsystem.oops;


import java.util.List;

public class BankServices {
	//should return new account based on saving/current
	public BankAccount createAccount(int accountNumber, String type, String accountHolderName, int initialBalance) {
		@SuppressWarnings("unused")
		 BankAccount bankAccount = null;
		
		if (type.equals("Saving")) {
			// bankAccount = new SavingAccount(accountNumber, accountHolderName, initialBalance);
			 return new SavingAccount(accountNumber, accountHolderName, initialBalance);
		}
		else if(type.equals("Current")){
			bankAccount = new CurrentAccount(accountNumber,accountHolderName,initialBalance);
		}
		
		return bankAccount;
		
	}
	//fetches account details 
	public BankAccount getAccountDetails(int accountNumber, List<BankAccount> bankaccounts){
		
		for(BankAccount bank : bankaccounts) {
			if(bank.accountNumber == accountNumber) {
				return bank;
			}
		}
		
		
	return null;
		
	}
	//adds money to an account
	public void deposit(BankAccount bankAccount , int amount) {
		
		bankAccount.balance = bankAccount.balance + amount;
		
		
	}
	//Deducts money based on balance rules
	public void withdraw(BankAccount bankAccount , int amount) {
		
		
		
	}
	//transfers money btwn the accounts
	public void  transferFunds(String fromAcc, String toAcc , int amount) {
		
	}
	

}
