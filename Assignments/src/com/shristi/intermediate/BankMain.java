package com.shristi.intermediate;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 2.
		Bank b = new Bank(2000);

		while (true) {
			System.out.println("1.withdraw\n2.deposit\n3.balance\n4.exit");
			int s = sc.nextInt();
			switch (s) {
			case 1:
				System.out.println("amount");
				int amt = sc.nextInt();
				b.withdraw(amt);
				break;

			case 2:
				System.out.println("amount");
				int amts = sc.nextInt();
				b.deposit(amts);
				break;

			case 3:
				System.out.println(b.getBalance());
				break;

			case 4:
				System.out.println("exit");
				System.exit(0);
				break;
			default:
				System.out.println("invalid");

			}
		}

	}

}
