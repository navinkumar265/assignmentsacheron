package com.shristi.inheritance;

public class Current extends Bank {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	void withdraw(double amount) {
		System.out.println("Current account withdraw with 2% additional charges");
		balance = balance - amount - (amount * 2 / 100);
	}

	void deposit(double amount) {
		System.out.println("Current account deposit with 1% additional charges");
		balance = balance + amount - (amount * 1 / 100);
	}

}
