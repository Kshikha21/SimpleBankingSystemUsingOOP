package com.simplebankingsystem.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		BankServices bankServices = new BankServices();
		BankAccount bankAccount;
		
		
		List<BankAccount> listOfBankAccounts = new ArrayList<BankAccount>();
		Scanner sc = new Scanner(System.in);
		byte choice;
		do {
		System.out.println("Welcome to MyBank!");
		System.out.println("1.create Account");
		System.out.println("2.deposit money");
		System.out.println("3.withdraw money");
		System.out.println("4.transfer funds");
		System.out.println("5.display account details");
		System.out.println("6.exit");
		System.out.print("Enter your choice : ");
		 choice  = sc.nextByte();
		 System.out.println();
		 System.out.println();

			switch (choice) {

			case 1: // to create account ask for certain details from user
				
				System.out.println("-----------------------------");
				System.out.println(" CREATE A NEW ACCOUNT  ");
				System.out.println("-----------------------------");

				System.out.println("Enter Account number       : ");

				int accountNumber = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Account Type (S/C)   : ");
				String typeOfAccount = sc.nextLine();

				System.out.println("Enter Account Holder Name  : ");
				String accountHolderName = sc.nextLine();

				System.out.println("Enter Intial Deposit       : ");
				int balance = sc.nextInt();

				bankAccount = bankServices.createAccount(accountNumber, typeOfAccount, accountHolderName, balance);

				System.out.println("-----------------------------");
				System.out.println(" Account Created Successfully!  ");
				

			//System.out.println("The account holder's details  : "+ 
				//	bankAccount.accountNumber + " " + bankAccount.accountHolderName + " " + bankAccount.balance +" "+typeOfAccount);

				listOfBankAccounts.add(bankAccount);
				//System.out.println("The list of bank accounts : " + listOfBankAccounts);

				break;
			case 2: 
				System.out.println("-----------------------------");
			       System.out.println(" DEPOSIT MONEY ");
			       System.out.println("-----------------------------");
				
				System.out.println("Enter Account Number     : ");
				int accountNumber3 = sc.nextInt();
				 bankAccount = bankServices.getAccountDetails(accountNumber3, listOfBankAccounts);
				 if(bankAccount == null) {
					 System.out.println("Account Number doesn't exist !! Kindly provide valid one.");
					 return;
				 }
				System.out.println("Enter Amount for Deposit : ");
				int amount = sc.nextInt();
				if(amount < 0){
					System.out.println("ALERT !! Amount needs to be positive.");
					return;
				}
				bankServices.deposit(accountNumber3,amount);
				System.out.println("-----------------------------");
				System.out.println("Amount deposited successfully !!");
				//System.out.println("Updated Balance in the Account : "+bankAccount.balance);
				
				
				break;
			case 3:
				break;
			case 4:
				break;
			case 5: System.out.println("Enter the account number to get details !! ");
			       int accountNumber2 = sc.nextInt();
			       BankAccount bankAccountDetails = bankServices.getAccountDetails(accountNumber2 , listOfBankAccounts);
			      
			       System.out.println("-----------------------------");
			       System.out.println(" ACCOUNT DETAILS  ");
			       System.out.println("-----------------------------");
			       
			       System.out.println("Account Number  : "+bankAccountDetails.accountNumber);
			       System.out.println("Account Holder  : "+bankAccountDetails.accountHolderName);
			       String determineType = determineTypeOf(bankAccountDetails);
				     
			       System.out.println("Account Type  : "+determineType);
			      
			     
			       System.out.println("Balance         : "+bankAccountDetails.balance);
			      // System.out.println("Overdraft Limit : "+bankAccountDetails +"(only for current Account)");
			   
			       System.out.println("-----------------------------");

			       
				break;
			default:
				System.out.println(" Thankyou for using the banking system !! Exiting ..........");

			}

	}while(choice != 6 && choice > 0);
		
	
}
	private static String determineTypeOf(BankAccount bankAccount) {
	    if (bankAccount instanceof SavingAccount) {
	    	
	        return "Saving Account";
	    } else if (bankAccount instanceof CurrentAccount) {
	        return "Current Account";
	    } else {
	        return "Unknown Account Type";
	    }
	}
 
}