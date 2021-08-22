package com.shristi.intermediate;

public class Bank {

	double balance;

	Bank(double balance) {
		this.balance = balance;
	}

	public void withdraw(int amt) {
		balance -= amt;
	}

	public void deposit(int amt) {
		balance += amt;
	}

	public double getBalance() {
		return balance;
	}
}
