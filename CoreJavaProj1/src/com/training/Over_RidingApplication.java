package com.training;



public class Over_RidingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeInsurance ins1 = new LifeInsurance(101,"Ram","monthly",1000);
		LifeInsurance ins2 = new LifeInsurance(101,"Ram","monthly",1000);
		System.out.println(ins1.equals(ins2));
		
	}

}
