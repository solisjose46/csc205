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
		double calcBal = ((double) this.balance)/100;
		double calcFee = ((double)this.overdraftFee)/100;

		String accountInfo =
			"Account type\t: Checking\n" +
			"Account #\t: " + this.accountNumber + "\n" + 
			"Balance\t: $" + String.format("%.2f",calcBal) + "\n" +
			"Interest rate\t: " + String.format("%.2f",(this.interestRate*100)) + "%\n" +
			"Overdraft fee\t: $" + String.format("%.2f",calcFee);
		return accountInfo;
	}
	public int getOverdraftFee(){
		return this.overdraftFee;
	}
	public void setOverdraftFee(int overdraftFee){
		this.overdraftFee = overdraftFee;
	}

}

