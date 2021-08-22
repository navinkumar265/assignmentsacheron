package com.shristi.basics;

import java.util.Scanner;

public class Basics4 {
	public static void main(String[] args) {

		// 4.Create a one dimensional array of type int and populate it using values
		// from scanner. Find the sum and average.

		int arr[] = new int[10];
		int sum = 0, avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total numbers");
		int n = sc.nextInt();
		System.out.println("enter array values");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		for (int var : arr)
			sum += var;
		avg = sum / n;
		System.out.println("sum is " + sum + "\naverage is " + avg);
	}

}
