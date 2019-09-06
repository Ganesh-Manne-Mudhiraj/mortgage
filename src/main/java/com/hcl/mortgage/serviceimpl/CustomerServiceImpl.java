package com.hcl.mortgage.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.mortgage.controller.CustomerController;
import com.hcl.mortgage.entity.CustomerEntity;
import com.hcl.mortgage.entity.CustomerPropertyEntity;
import com.hcl.mortgage.entity.LoanEntity;
import com.hcl.mortgage.model.Customer;
import com.hcl.mortgage.model.Loan;
import com.hcl.mortgage.repository.CustomerRepository;
import com.hcl.mortgage.repository.LoanRepository;
import com.hcl.mortgage.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	
	  @Autowired 
	  private CustomerRepository customerRepository;
	  
	  @Autowired
	  private LoanRepository loanRepository;
	  
	  Logger log = LoggerFactory.getLogger(CustomerController.class);
	  
	@Override
	public List<Loan> save(Customer customer) {
		List<LoanEntity> loanEntity=null;
		List<Loan> loans=null;
		CustomerEntity  customerEntity=null;
		
		if((customer.getAge() > 20 && customer.getAge() < 60) && customer.getSalary() < 10000) {
			 
			log.info("=====> Hi customer, U r not eligible for martgage loan <=====");
		}
		if(customer!=null) {
			customerEntity = new CustomerEntity();
			CustomerPropertyEntity customerPropertyEntity = new CustomerPropertyEntity();
			customerEntity.setAge(customer.getAge());
			customerEntity.setDob(customer.getDob());
			customerEntity.setFirstName(customer.getFirstName());
			customerEntity.setLastName(customer.getLastName());
			customerEntity.setPanNumber(customer.getPanNumber());
			customerEntity.setEmailId(customer.getEmailId());
			customerPropertyEntity.setCustomerEntity(customerEntity);
			customerPropertyEntity.setPropertyType(customer.getPropertyType());
			customerPropertyEntity.setPropertyAddress(customer.getPropertyAddress());
			customerPropertyEntity.setPropertyValue(customer.getPropertyValue());
			customerEntity.setCustomerPropertyEntity(customerPropertyEntity);
			customerRepository.save(customerEntity);
			
			double amount = customer.getPropertyValue()*0.8;
			 
			LoanServiceImpl loanServiceImpl = new LoanServiceImpl();
			loans = loanServiceImpl.findByAmount(amount);
			// BeanUtils.copyProperties(loanEntity,loan);
			 Loan Loans = new Loan();
			// Loans.setLoanId(lo);
		}
		
		return loan;
		}

	
	}
	
	

	
	
	 
	 
	
	
	
	
	

