package com.hcl.mortgage.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.mortgage.entity.LoanEntity;
import com.hcl.mortgage.model.Loan;
import com.hcl.mortgage.repository.LoanRepository;
import com.hcl.mortgage.service.LoanService;

@Service
public class LoanServiceImpl implements LoanService{

	@Autowired
	LoanRepository loanRepository; 
	List<Loan> loans=null;
	@Override
	public List<Loan> findByAmount(double amount) {
		
		List<LoanEntity> loansEntity = loanRepository.findByAmount(amount);
		loans.add(loansEntity);
		return ;
	}



}
