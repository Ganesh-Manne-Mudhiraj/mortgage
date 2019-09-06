package com.hcl.mortgage.service;


import java.util.List;

import com.hcl.mortgage.entity.LoanEntity;

public interface LoanService{

	
	
	List<LoanEntity>  findByAmount(double amount);
}
