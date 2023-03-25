package com.example.bumblebeecompanymanagement.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String cname;
	private String address;
	private int mobile;
	private int age;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public Customer(Long id, String cname, String address, int mobile, int age) {
	
		this.id = id;
		this.cname = cname;
		this.address = address;
		this.mobile = mobile;
		this.age = age;
	}
	
	public Customer() {
		
		
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", cname=" + cname + ", address=" + address + ", mobile=" + mobile + ", age="
				+ age + "]";
	}
	
	
	
}
