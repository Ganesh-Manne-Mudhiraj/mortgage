package com.hcl.mortgage.service;

import java.util.List;

import com.hcl.mortgage.model.Customer;
import com.hcl.mortgage.model.Loan;

public interface CustomerService{
	
	List<Loan> save(Customer customer);
	
	
}
