package com.training;

public class InsuranceManagerApplication {
	public static void main(String args[]){
		LifeInsurance ins1 = new LifeInsurance(101, "Ram", "QTR", 10000);
		LifeInsurance ins2 = new LifeInsurance(102, "Sam", "HLF", 20000);
		LifeInsurance ins3 = new LifeInsurance(103, "Dam", "ANN", 40000);
		LifeInsurance ins4 = new LifeInsurance(104, "Lam", "QTR", 30000);
		
		LifeInsurance[] list = new LifeInsurance[4];
		
		list[0] = ins1;
		list[1] = ins2;
		list[2] = ins3;
		list[3] = ins4;
		
		InsuranceManager obj = new InsuranceManager();
		obj.printPremiums(list);
		
	}
}
