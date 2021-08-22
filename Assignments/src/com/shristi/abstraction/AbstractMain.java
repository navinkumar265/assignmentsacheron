package com.shristi.abstraction;

import java.util.Scanner;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 for withdraw \n2 for deposit");
		int choice = sc.nextInt();
		System.out.println("enter account type \ns for savings \nc for current");
		sc.nextLine();
		String type = sc.nextLine();
		Bank bank = null;
		if (type.equalsIgnoreCase("s")) {
			bank = new Savings(4000);
		} else if (type.equalsIgnoreCase("c")) {
			bank = new Current(9000);
		} else {
			System.out.println("invalid input");
			System.exit(0);
		}
		switch (choice) {
		case 1:
			System.out.println("enter amount to withdraw");
			double amount = sc.nextDouble();
			bank.withdraw(amount);
			System.out.println(bank.getBalance());
			break;
		case 2:
			System.out.println("enter amount to deposit");
			double cash = sc.nextDouble();
			bank.withdraw(cash);
			System.out.println(bank.getBalance());
			break;
		default:
			System.out.println("invalid input exiting...");
			System.exit(0);

		}
	}

}
