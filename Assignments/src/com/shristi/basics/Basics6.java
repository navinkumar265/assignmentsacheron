package com.shristi.basics;

import java.util.Scanner;

public class Basics6 {

	public static void main(String[] args) {

		// 6.Create a string array of usernames in PSVM. Get user input using scanner as
		// (“Enter name to register”).
		// If name already exists, print message as ”Name is not unique”. If name does
		// not exist, print message as ”You are registered”.

		String usernames[] = new String[] { "navin1", "navin2", "navin3" };
		int f = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username to register");
		String uname = sc.next();

		for (String var : usernames) {
			if (uname.equals(var))
				f = 1;
		}
		if (f == 1)
			System.out.println("Name is not unique");
		else
			System.out.println("You are registered");

	}

}
