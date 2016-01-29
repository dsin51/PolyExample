package com.training;

public class LifeInsuranceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeInsurance liObj1 = new LifeInsurance(); //default constructor
		System.out.println(liObj1.calculatePremium());
		
		LifeInsurance liObj = new LifeInsurance(101,"Ram","monthly",1000);
		System.out.println(liObj.calculatePremium(1000));
		
	}

}
