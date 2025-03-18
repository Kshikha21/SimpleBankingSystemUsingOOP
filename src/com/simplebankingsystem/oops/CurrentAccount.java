package com.simplebankingsystem.oops;

public class CurrentAccount extends BankAccount{
	
	private int overdraftLimit = 1000;
    
	

	public CurrentAccount(int accountNumber, String accountHolderName2, int balance2) {
		super(accountNumber, accountHolderName2, balance2);
	}

	public CurrentAccount(int accountNumber,String accountHolderName , int balance, int overdraftLimit) {
		super(accountNumber,accountHolderName,balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdram(int amount) {
		int availableFunds = balance + overdraftLimit;
		if(amount > availableFunds ) {
			System.out.println(" Withdrawal failed! Exceeds overdraft limit.");
			
		}
		else {
			balance = balance - amount;
			System.out.println("Withdrawal successfull, New balance: "+balance);
		}
		
	}

}
