package com.training;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value = 0;
		CurrencyConverter obj = new CurrencyConverter();
		System.out.println("Enter the amount in dollar:");
		Scanner sin = new Scanner(System.in);
		try{
			double amount = sin.nextDouble();
			value = obj.dollartoInr(amount);
			System.out.println("INR Amount:"+ value);
		}catch(Exception e)
		{System.out.println("Enter a decimal value noob !!");}
		finally{
			sin.close();
		}
	}

}
