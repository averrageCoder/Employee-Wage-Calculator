package com.bridgelabz.employeewagecalculator;

public class EmployeeWageCalculator {
	
	public static void main(String[] args) {

		int FULL_TIME =1;
		int EMP_RATE_PER_HOUR = 20;
		
		int empWage = 0;
		int empHrs = 0;
		
		double attendance = Math.floor(Math.random()*10) %2;
		
		if (attendance == FULL_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage : "+empWage);
	
	}

}
