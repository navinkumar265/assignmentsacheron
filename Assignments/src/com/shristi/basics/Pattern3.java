package com.shristi.basics;

import java.util.Arrays;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// second largest and second smallest

		int arr[] = { 12, 35, 1, 10, 34, 1 };
		int n = arr.length;

		Arrays.sort(arr);
		System.out.println("second largest " + arr[n - 2]);
		System.out.println("second smallest " + arr[2]);
	}

}
