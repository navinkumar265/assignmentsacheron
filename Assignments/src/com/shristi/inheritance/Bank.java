package com.shristi.inheritance;

public class Bank {

	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
		System.out.println("***balance before transaction***\n" + balance);
	}

	void withdraw(double amount) {
		System.out.println("in defalut");
		balance -= amount;
	}

	void deposit(double amount) {
		System.out.println("in defalut");
		balance += amount;
	}

	double getBalance() {
		System.out.println("***balance after transaction***");
		return balance;
	}

}
