package com.BankLoan;

public class PersonalLoan {
	private int loanAmount;
	private int interestRate = 0;
	private int salary;
	
	public int calculateInterestRate(int loanAmount) {
		if (loanAmount < 50000) {
			interestRate = 14;
		}
		else interestRate = 13;	
		return interestRate;
	}
	public int calculateLoanAmount(int salary) {
		return salary*12;
	}
}
