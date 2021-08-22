package com.shristi.intermediate;

public class Student {

	String name;
	int id;
	int arr[] = new int[3];

	Student(String name, int id, int a[]) {
		this.name = name;
		this.id = id;
		this.arr = a;
	}

	void getDetails() {

		System.out.println("name " + name + "\nid " + id + "\ntotal " + sum + "\naverage " + avg + "\nGrade " + grade
				+ "\nmarks ");
		for (int var : arr)
			System.out.println(var);
	}

	int sum = 0;
	String grade;
	float avg = 0.0f;

	void getGrades() {

		for (int var : arr)
			sum += var;
		avg = sum / 3;
		if (avg > 90)
			grade = "A";
		else if (avg > 75)
			grade = "B";
		else
			grade = "C";

	}

}
