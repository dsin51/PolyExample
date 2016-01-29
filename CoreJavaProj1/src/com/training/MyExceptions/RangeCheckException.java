package com.training.MyExceptions;

// Inheritance
// Checked Exception - Because extending Exception

public class RangeCheckException extends Exception {
	private long handPhone;
	
	//Mandatory Dependency
	public RangeCheckException(long handPhone) {
		super();
		this.handPhone = handPhone;
	}

	// Overriding super class method
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return handPhone + " should be a 10-digit number";
		
	}
	
	
}
