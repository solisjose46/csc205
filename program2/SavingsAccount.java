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
		double calcBal = ((double) this.balance)/100;

		System.out.println("BALANCE: " + calcBal);
		String accountInfo =
			"Account type\t: Savings\n" +
			"Account #\t: " + this.accountNumber + "\n" +
			"Balance\t: $" + String.format("%.2f", calcBal) + "\n" +
			"Interest rate\t: " + String.format("%.2f", (this.interestRate*100)) + "%";
		return accountInfo;
	}

}

