package com.bridgelabz.employeewagecalculator;

public class EmployeeWageCalculator {
	
	private static final int PART_TIME=2;
	private static final int FULL_TIME=1;
	private static final int EMP_RATE_PER_HOUR = 20;
	private static final int NUM_WORKING_DAYS = 20;
	private static final int MAX_WORK_HRS = 100;
	
	private int empHrs;
	private int total_empHrs;
	private int total_workingDays;
	
	public static void EmployeeWageCalculator() {
		int empHrs = 0;
		int total_empHrs = 0;
		int total_workingDays = 0;
	}
	
	public static int getEmployeeHrs(int attendance) {
		int empHrs;
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
		return empHrs;
	}

	
	public static void main(String[] args) {
		
		EmployeeWageCalculator employeeObject = new EmployeeWageCalculator(); 
		
		while(employeeObject.total_empHrs <= MAX_WORK_HRS && employeeObject.total_workingDays < NUM_WORKING_DAYS) {
			
			employeeObject.total_workingDays++;
			int attendance = (int) Math.floor(Math.random()*10) %3;
			
			employeeObject.empHrs = getEmployeeHrs(attendance);
			
			employeeObject.total_empHrs += employeeObject.empHrs;
			System.out.println("Day"+employeeObject.total_workingDays+": Emp Hrs = "+employeeObject.empHrs);
		}
		
		int total_empWage = employeeObject.total_empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage : "+total_empWage);
	
	}

}
