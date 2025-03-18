package com.simplebankingsystem.oops;

public abstract class BankAccount {
	int accountNumber;
	String accountHolderName;
	int balance;
	
	public BankAccount(int accountNumber, String accountHolderName2, int balance2) {
		// TODO Auto-generated constructor stub
		this.accountHolderName = accountHolderName2;
		this.balance = balance2;
		this.accountNumber = accountNumber;
	}

	//to add money to the account
	public void deposit(int amount) {
		 balance = balance + amount;
	 }
	
	//to deduct money from the account
	abstract void withdram(int amount);
		
	
	//to display account details 
	public void displayBalance() {
		System.out.println("Current balance of this account: "+balance);
	}

}
