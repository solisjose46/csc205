//*********************************************************************************
// CSC205: 33640 / online
// Program: BankAccount
// Author: Jose Solis & 35558159
// Description: SavingsAccount extends the base class BankAccount
//*********************************************************************************

public class SavingsAccount extends BankAccount{
	SavingsAccount(){
		super();
	}
	@Override
	public boolean debit(int amount){
		if(this.balance - amount < 0){
			return false;
		}
		this.balance-=amount;
		return true;
	}
	@Override
	public void applyInterest(){
		this.balance+=(this.interestRate*this.balance);
	}
	@Override
	public String getAccountInfo(){
		String accountInfo =
			"Account type\t: Savings\n" +
			"Account #\t: " + this.accountNumber +
			"Balance\t: $" + String.format("%.2f",((double)(this.balance/100))) +
			"Interest rate\t: " + (this.interestRate*100) + "%";
		return accountInfo;
	}

}

