package com.shristi.basics;

import java.util.Scanner;

public class Basics5 {

	public static void main(String[] args) {

		// 5.Create a one dimensional array of type int and populate it using values
		// from scanner.
		// Get the square root of each number and populate in another array. Print the
		// new array.

		int arr[] = new int[10];
		int newarr[] = new int[10];
		int sum = 0, avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total numbers");
		int n = sc.nextInt();
		System.out.println("enter array values");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < n; i++)
			newarr[i] = arr[i] * arr[i];

		System.out.println("new array with square values");
		for (int i = 0; i < n; i++)
			System.out.println(newarr[i]);
	}

}
