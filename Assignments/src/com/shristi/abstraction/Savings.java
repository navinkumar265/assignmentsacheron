package com.shristi.abstraction;

public class Savings extends Bank {

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	void withdraw(double amount) {
		System.out.println("Savings account withdraw with 0% charges");
		balance -= amount;
	}

	void deposit(double amount) {
		System.out.println("Savings account deposit with 0% charges");
		balance += amount;
	}

}
