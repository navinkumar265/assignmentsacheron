package com.shristi.abstraction;

public abstract class Bank {

	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
		System.out.println("***balance before transaction***\n" + balance);
	}

	abstract void withdraw(double amount);

	abstract void deposit(double amount);

	double getBalance() {
		System.out.println("***balance after transaction***");
		return balance;
	}

}
