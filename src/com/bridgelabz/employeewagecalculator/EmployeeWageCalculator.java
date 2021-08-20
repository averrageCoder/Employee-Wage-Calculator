package com.bridgelabz.employeewagecalculator;

public class EmployeeWageCalculator {
	
	private static final int PART_TIME=2;
	private static final int FULL_TIME=1;
	private static final int EMP_RATE_PER_HOUR = 20;
	private static final int NUM_WORKING_DAYS = 20;
	
	public static void main(String[] args) {
		
		int empWage = 0;
		int empHrs = 0;
		int totalWage = 0;
		
		for(int i=0; i<NUM_WORKING_DAYS; i++) {
			
			int attendance = (int) Math.floor(Math.random()*10) %3;
			
			switch(attendance) {
			
			case FULL_TIME:
				empHrs = 8;
				break;
				
			case PART_TIME:
				empHrs = 4;
				break;
				
			default:
				empHrs = 0;
			
			}
			
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalWage += empWage;
		}
		
		System.out.println("Total Employee Wage : "+totalWage);
	
	}

}
