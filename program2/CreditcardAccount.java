//*********************************************************************************
// CSC205: 33640 / online
// Program: BankAccount
// Author: Jose Solis & 35558159
// Description: CreditcardAccount extends the base class BankAccount
//*********************************************************************************

public class CreditcardAccount extends BankAccount{
	private int creditLimit;

	CreditcardAccount(){
		super();
		this.creditLimit = 0;
	}
	@Override
	public boolean debit(int amount){
		if(this.balance + amount > this.creditLimit){
			return false;
		}
		this.balance+= amount;
		return true;
	}
	@Override
	public void applyInterest(){
		if(!(this.balance > 0)){
			this.balance+=(this.balance*this.interestRate);
		}
	}
	@Override
	public String getAccountInfo(){
		String accountInfo =
			"Account type\t: Creditcard\n" +
			"Account #\t: " + this.accountNumber +
			"Balance\t: $" + String.format("%.2f",((double)(this.balance/100))) +
			"Interest rate\t: " + (this.interestRate*100) + "%" +
			"Credit limit\t: " + String.format("%.2f",((double)(this.creditLimit/100)));
		return accountInfo;
	}
	public int getCreditLimit(){
		return this.creditLimit;
	}
	public void setCreditLimit(int creditLimit){
		this.creditLimit = creditLimit;
	}

}

