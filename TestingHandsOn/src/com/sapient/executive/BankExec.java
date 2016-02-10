package com.sapient.executive;

public class BankExec {
	private long accountNumber;
	private String accHolderName;
	private float balance;
	public BankExec(long accountNumber, String accHolderName, float balance) {
		super();
		this.accountNumber = accountNumber;
		if(accHolderName!=null)
			this.accHolderName = accHolderName;
		else
			throw new NullPointerException();
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public float deposit(float amountDeposited){
		return balance+amountDeposited;
	}
	
	public float withdraw(float amountWithdrawn){
		try {
			Thread.sleep(130);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(amountWithdrawn<=balance)
			return balance-amountWithdrawn;
		else
			return 0.0f;
		
	}
}
