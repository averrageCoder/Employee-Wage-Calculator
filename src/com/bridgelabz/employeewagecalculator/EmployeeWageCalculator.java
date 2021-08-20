package com.bridgelabz.employeewagecalculator;

public class EmployeeWageCalculator {
	
	public static void main(String[] args) {

		int FULL_TIME =1;
		
		double attendance = Math.floor(Math.random()*10) %2;
		
		if (attendance == FULL_TIME)
			System.out.println("Employee is present!");
		else
			System.out.println("Employee is absent!");
	
	}

}
