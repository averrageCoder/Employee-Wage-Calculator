package com.bridgelabz.employeewagecalculator;

public class EmployeeWageCalculator {
	public static final int IS_PART_TIME= 1;
	public static final int IS_FULL_TIME= 2;
	
	private String company;
	private int empRateperHour;
	private int numOfWorkingDays;
	private int maxHrsPerMonth;
	private int totalEmpWage;
	
	public EmployeeWageCalculator(String company, int empRateperHour, int numOfWorkingDays, int maxHrsPerMonth) {
		
		this.company = company;
		this.empRateperHour = empRateperHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
		
	}
	
	public void computeEmpWage() {
		// Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= this.maxHrsPerMonth && totalWorkingDays < this.numOfWorkingDays) {
				totalWorkingDays++;
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
				switch (empCheck) {
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
				}
				totalEmpHrs += empHrs;
				System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +empHrs);
		}
		totalEmpWage = totalEmpHrs * this.empRateperHour;
		//System.out.println("Total Emp Wage for "+this.company+" is " + totalEmpWage);
		//return totalEmpWage;
	}
	@Override
	public String toString() {
		return "Total Emp Wage for Company: "+company+" is: "+ totalEmpWage;
	}
	public static void main(String[] args) {
		EmployeeWageCalculator dMart = new EmployeeWageCalculator("DMart", 20, 2, 10);
		dMart.computeEmpWage();
		System.out.println(dMart);
		EmployeeWageCalculator reliance = new EmployeeWageCalculator("Reliance", 10, 2, 10);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}
}