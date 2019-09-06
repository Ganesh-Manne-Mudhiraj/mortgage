package com.hcl.mortgage.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class CustomerEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="customer_id")
	private long id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="age")
	private int age;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="salary")
	private double salary;
	
	@Column(name="pan_number")
	private String panNumber;
	
	@Column(name="email_id")
	private String emailId;
	
	@OneToOne( cascade =  CascadeType.ALL,mappedBy = "customerEntity")
	private CustomerPropertyEntity customerPropertyEntity;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public CustomerPropertyEntity getCustomerPropertyEntity() {
		return customerPropertyEntity;
	}

	public void setCustomerPropertyEntity(CustomerPropertyEntity customerPropertyEntity) {
		this.customerPropertyEntity = customerPropertyEntity;
	}
	
	
	
}
