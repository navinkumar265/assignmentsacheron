package com.shristi.constructor;

import java.util.Scanner;

public class OverloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double bonus;
		String[] designation = new String[3];
		String[] name = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("enter emp " + (i + 1) + " name and designation");
			name[i] = sc.nextLine();
			designation[i] = sc.nextLine();
		}
		Employee e1 = new Employee(name[0], designation[0]);
		Employee e2 = new Employee(name[1], designation[1]);
		Employee e3 = new Employee(name[2], designation[2]);
		for (String var : designation) {
			switch (var) {
			case "programmer":
				bonus = e2.calBonus(10);
				e2.getDetails(bonus);
				break;
			case "manager":
				bonus = e1.calBonus(10, 100);
				e1.getDetails(bonus);
				break;
			case "director":
				bonus = e3.calBonus(10, 100, 1000);
				e3.getDetails(bonus);
				break;
			default:
				System.out.println("invalid designation");
			}
			System.out.println();
		}

	}

}
