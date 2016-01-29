package com.training;

public class LifeInsurance {
	
	private int policyNumber;
	private String policyHolderName;
	private String paymentMode;
	private int policyAmount;
	
	static {
		System.out.println("static block called");
	}
	{
		System.out.println("Initialization block called");
	}
	
	public LifeInsurance(){
		super();
		System.out.println("Default constructor called");
	}

	LifeInsurance(int p_no,String name, String pay_mode, int p_amount){
		System.out.println("Parameterised Constructor called");
		policyNumber = p_no;
		policyHolderName = name;
		paymentMode = pay_mode;
		policyAmount = p_amount;
	}
	
	public int getPolicyNumber() {
		return policyNumber;
	}


	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}


	public String getPolicyHolderName() {
		return policyHolderName;
	}


	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}


	public String getPaymentMode() {
		return paymentMode;
	}


	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	public int getPolicyAmount() {
		return policyAmount;
	}


	public void setPolicyAmount(int policyAmount) {
		this.policyAmount = policyAmount;
	}


	public double calculatePremium(){
		double amount = this.policyAmount*0.1;
		return amount;
	}
	public double calculatePremium(double PolicyAmt){
		double amount = PolicyAmt * 0.1;
		double discount = amount * 0.05;
		return (amount-discount);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.policyNumber + ":" + this.policyHolderName + ":" + this.paymentMode + ":" + this.policyAmount;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//checking for identity
		if(this == obj) 
			return true;
		//cautious
		if(obj == null)
			return false;
		//checking for object's class
		if(getClass() != obj.getClass())
			return false;
		//casting
		LifeInsurance ins = (LifeInsurance)obj;
		//checking the condition
		return policyNumber == ins.policyNumber && policyHolderName.equals(ins.policyHolderName);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int code = this.policyNumber + 7 *policyNumber;
		return (int)code;
	}
	
}
