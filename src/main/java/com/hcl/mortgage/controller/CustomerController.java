package com.hcl.mortgage.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.mortgage.model.Customer;
import com.hcl.mortgage.model.Loan;
import com.hcl.mortgage.serviceimpl.CustomerServiceImpl;


@RestController
@RequestMapping("/cust")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	Logger log = LoggerFactory.getLogger(CustomerController.class);
	
	@PostMapping("/save")
	ResponseEntity<Object> saveCustomer(@RequestBody Customer customer){
		
		List<Loan> loans =customerServiceImpl.save(customer);
		log.info("=====> saveCustomer() <=====");
		
		
		return new ResponseEntity<Object>(loans,HttpStatus.OK);
	}
}
