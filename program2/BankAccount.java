//*********************************************************************************
// CSC205: 33640 / online
// Program: BankAccount
// Author: Jose Solis & 35558159
// Description: This class is base class for all accounts
//*********************************************************************************

public abstract class BankAccount{
	protected String accountNumber;
	protected double interestRate;
	protected int balance;

	BankAccount(){
		this.accountNumber = "0000-0000-0000-0000";
		this.interestRate = 0;
		this.balance = 0;
	}
	public boolean credit(int amount){
		this.balance+=amount;
		return true;
	}
	public abstract boolean debit(int amount);
	public int getBalance(){
		return this.balance;
	}
	public String getAccountNumber(){
		return this.accountNumber;
	}
	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}
	public double getInterestRate(){
		return this.interestRate;
	}
	public void setInterestRate(double interestRate){
		this.interestRate = interestRate;
	}
	public abstract void applyInterest();
	public abstract String getAccountInfo();

}

