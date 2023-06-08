package com.session.three;

public class Account {
	private String bankName;
	private int accountNumber;
	
	public Account(String bankName, int accountNumber) {
		this.bankName = bankName;
		this.accountNumber = accountNumber;
	}
	
	public void display() {
		System.out.println("Bank Name is " + this.bankName + " , account number is " + accountNumber);
	}
 
}
 