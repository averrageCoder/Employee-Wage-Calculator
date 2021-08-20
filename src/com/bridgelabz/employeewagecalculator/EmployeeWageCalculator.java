package com.bridgelabz.employeewagecalculator;

public class EmployeeWageCalculator {
	
	private static final int PART_TIME=2;
	private static final int FULL_TIME=1;
	private static final int EMP_RATE_PER_HOUR = 20;
	private static final int NUM_WORKING_DAYS = 20;
	private static final int MAX_WORK_HRS = 100;
	
	public static void main(String[] args) {
		
		int empHrs = 0;
		int total_empHrs = 0;
		int total_workingDays = 0;
		
		while(total_empHrs <= MAX_WORK_HRS && total_workingDays < NUM_WORKING_DAYS) {
			
			total_workingDays++;
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
			
			total_empHrs += empHrs;
			System.out.println("Day"+total_workingDays+": Emp Hrs = "+empHrs);
		}
		
		int total_empWage = total_empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage : "+total_empWage);
	
	}

}
