package com.training;

import com.training.MyExceptions.RangeCheckException;

public class ExceptionApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Customer cust = new Customer(101,"ramesh","abc@abhd.com",899);
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
