package com.myproject.methods;

public class TestBankOperation {
	public static void main(String args[])
	{
		Bank account= new Bank(23000, "Yasha", "BOI");
		BankOperation opr= new BankOperation();
		System.out.println("User "+ account.uname+ " has "+account.amount+ " in "+account.bname +" account");
		System.out.println(opr.showBalance(account));
		
		double newBalance= opr.withdraw(account, 1000);
		System.out.println("Amount withdrawn is Rs. 1000");
		System.out.println("User "+ account.uname+ " now has "+newBalance+ " in "+account.bname +" account");
				

}
}
