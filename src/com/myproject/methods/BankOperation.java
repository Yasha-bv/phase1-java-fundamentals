package com.myproject.methods;

public class BankOperation {

	public double showBalance(Bank account)
	{
		return account.amount;
	}

	public double withdraw(Bank account, double amountt)
	{
		if (amountt<account.amount && amountt>0)
		{
			account.amount=account.amount-amountt;
			
		}else
		{
			System.out.println("invalid amount");
		}
		return account.amount;
	}
}
