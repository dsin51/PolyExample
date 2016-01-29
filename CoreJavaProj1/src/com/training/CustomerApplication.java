package com.training;

public class CustomerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cust1 = new Customer();
		
		cust1.setCustomerId(101);
		cust1.setCustomerName("Gandhi");
		cust1.setEmail("gandhi@india.com");
		cust1.setHandPhone(987654);
		
		System.out.println(cust1.showCustomer());
		
		//Customer cust2 = new Customer(102,"Nehru","nehru@india.com",9876782342L);
		
		//System.out.println(cust2.showCustomer());
	}

}
