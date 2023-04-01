package com.example.bumblebeecompanymanagement.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customerreg")
public class CustomerReg {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String customername;
	private String customeraddress;
	private int mobile;
	private int age;
	private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CustomerReg(Long id, String customername, String customeraddress, int mobile, int age, String email) {

		this.id = id;
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.mobile = mobile;
		this.age = age;
		this.email = email;
	}
	
	public CustomerReg() {

		
	}
	
//	@Override
//	public String toString() {
//		return "CustomerReg [id=" + id + ", customername=" + customername + ", customeraddress=" + customeraddress
//				+ ", mobile=" + mobile + ", age=" + age + ", email=" + email + "]";
//	}
//	
	
	
	
}
