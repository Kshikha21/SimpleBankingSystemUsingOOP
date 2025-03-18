package com.simplebankingsystem.oops;

public class SavingAccount extends BankAccount {

	
	public SavingAccount(int accountNumber, String accountHolderName2, int balance2) {
		super(accountNumber, accountHolderName2, balance2);
		// TODO Auto-generated constructor stub
	}

	BankAccount bankAccount;
	

	@Override
	void withdram(int amount) {
		
		if(bankAccount.balance - amount < 1000) {
			System.out.println("No withdrawal since the minimum balance in the saving account is 1000 and withdrawal will fall short for a saving account citeria!!");
			return;	
		}else {
			int currentBalance = bankAccount.balance - amount ;
			System.out.println("Amount :"+amount+" has been successfully withdrawn from your saving account");
			System.out.println("Updated balance post withdrawl is : "+currentBalance);
		   bankAccount.balance = currentBalance;
		  
		}
		
	}
}
