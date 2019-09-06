package com.hcl.mortgage.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customerpropertyentity")
public class CustomerPropertyEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="property_type")
	private String propertyType;
	
	@Column(name="property_address")
	private String propertyAddress;
	
	@Column(name="property_value")
	private double propertyValue;
	
	@OneToOne(fetch = FetchType.LAZY,			
			  cascade =  CascadeType.ALL)
	@JoinColumn(name="cust_id")
	CustomerEntity customerEntity;
	
	
	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}
	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getPropertyAddress() {
		return propertyAddress;
	}
	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}
	public double getPropertyValue() {
		return propertyValue;
	}
	public void setPropertyValue(double propertyValue) {
		this.propertyValue = propertyValue;
	}
	
	
	
}
