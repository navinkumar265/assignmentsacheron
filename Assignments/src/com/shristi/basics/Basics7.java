package com.shristi.basics;

import java.util.Scanner;

public class Basics7 {

	public static void main(String[] args) {
		// 7. Create a string array of usernames in PSVM. Get user input using scanner
		// as (“Enter username to login”). If name exists, print message as ”You are
		// logged in successfully”.
		// If name does not exist, print message as ”Invalid username”.

		String usernames[] = new String[] { "navin1", "navin2", "navin3" };
		int f = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username to login");
		String uname = sc.next();

		for (String var : usernames) {
			if (uname.equals(var))
				f = 1;
		}
		if (f == 1)
			System.out.println("You are logged in successfully");
		else
			System.out.println("Invalid username");
	}

}
