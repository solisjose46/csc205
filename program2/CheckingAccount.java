//*********************************************************************************
// CSC205: 33640 / online
// Program: BankAccount
// Author: Jose Solis & 35558159
// Description: CheckingAccount extends the base class BankAccount
//*********************************************************************************

public class CheckingAccount extends BankAccount{
	private int overdraftFee;

	CheckingAccount(){
		super();
		this.overdraftFee = 0;
	}
	@Override
	public boolean debit(int amount){
		this.balance-=amount;
		if(this.balance < 0){
			this.balance-=this.overdraftFee;
		}
		return true;
	}
	@Override
	public void applyInterest(){
		if(!(this.balance < 0)){
			this.balance+=(this.balance*this.interestRate);
		}
	}
	@Override
	public String getAccountInfo(){
		String accountInfo =
			"Account type\t: Checking\n" +
			"Account #\t: " + this.accountNumber +
			"Balance\t: $" + String.format("%.2f",((double)(this.balance/100))) +
			"Interest rate\t: " + (this.interestRate*100) + "%" +
			"Overdraft fee\t: " + String.format("%.2f",((double)(this.overdraftFee/100)));
		return accountInfo;
	}
	public int getOverdraftFee(){
		return this.overdraftFee;
	}
	public void setOverdraftFee(int overdraftFee){
		this.overdraftFee = overdraftFee;
	}

}

