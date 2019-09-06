package com.hcl.mortgage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.mortgage.entity.LoanEntity;

public interface LoanRepository extends JpaRepository<LoanEntity, Long>{

	 List<LoanEntity> findByAmount(double amount);
}
