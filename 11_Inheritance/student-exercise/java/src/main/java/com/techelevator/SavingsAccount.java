package com.techelevator;

public class SavingsAccount extends BankAccount 
{
	public SavingsAccount(String accountHolderName, String accountNumber)
	{
		super(accountHolderName, accountNumber);
	}
	
	public SavingsAccount(String accountHolderName, String accountNumber, int balance)
	{
		super(accountHolderName, accountNumber, balance);
	}
	
	public int withdraw(int amountToWithdraw)
	{
		 //if getBalance - amountToWithdraw >= 0
		//super(withdraw
		if (getBalance() - amountToWithdraw >= 0)
		{
			super.withdraw(amountToWithdraw);
		
			if (getBalance() < 150)
			{
				super.withdraw(2);
			}
		}
			return getBalance();
	}
	
}
//withdraw	If the current balance is less than $150 when a withdrawal is made, an additional $2 service charge is withdrawn from the account.
//If a withdrawal is requested for more than the current balance, the withdrawal fails and the balance remains the same. No fees are incurred.






