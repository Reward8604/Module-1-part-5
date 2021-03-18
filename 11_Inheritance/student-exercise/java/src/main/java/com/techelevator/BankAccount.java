package com.techelevator;

public class BankAccount 
{
	//Instance Variable/ Attributes:
	
	private String accountHolderName;
	private String accountNumber;
	private int balance;
	
	//Constructors
	
	public BankAccount(String accountHolderName, String accountNumber)
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
	}
	
	public BankAccount(String accountHolderName, String accountNumber, int balance)
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	
	//Methods
	
	public int deposit(int amountToDeposit)
	{
		return balance += amountToDeposit; //balance = balance + amountToDeposit;
	}
	
	public int withdraw(int amountToWithdraw)
	{ 
		return balance -= amountToWithdraw;// balance = balance + amountToWithdraw;
	}
		
	
	//Getters
	
	public String getAccountHolderName()
	{
		return this.accountHolderName;  
	}
	
	public String getAccountNumber()
	{
		return this.accountNumber;
	}
	
	public int getBalance()
	{
		return this.balance;
	}
	
	
	
}
