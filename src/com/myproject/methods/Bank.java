package com.myproject.methods;

public class Bank {

	long accnum;
	double amount;
	String uname;
	String bname;
	
	Bank(){}
	
	Bank(long accnum)
	{
		this.accnum= accnum;
	}
	
	Bank(int amount, String uname, String bname)
	{
		this.amount=amount;
		this.uname= uname;
		this.bname=bname;
	}
	public Bank(long accnum, String bname) {
		super();
		this.accnum = accnum;
		this.bname = bname;
	}

}
