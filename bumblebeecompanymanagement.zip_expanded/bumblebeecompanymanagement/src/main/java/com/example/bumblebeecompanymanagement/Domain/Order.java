package com.example.bumblebeecompanymanagement.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orderdetails")
public class Order {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private int  cid;
	private double total;
	private double usedamount;
	private double availableamount;
	private String installment;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getUsedamount() {
		return usedamount;
	}
	public void setUsedamount(double usedamount) {
		this.usedamount = usedamount;
	}
	public double getAvailableamount() {
		return availableamount;
	}
	public void setAvailableamount(double availableamount) {
		this.availableamount = availableamount;
	}
	public String getInstallment() {
		return installment;
	}
	public void setInstallment(String installment) {
		this.installment = installment;
	}
	public Order(Long id, int cid, double total, double usedamount, double availableamount, String installment) {
		
		this.id = id;
		this.cid = cid;
		this.total = total;
		this.usedamount = usedamount;
		this.availableamount = availableamount;
		this.installment = installment;
	}
	
	
	public Order() {
		
	
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", cid=" + cid + ", total=" + total + ", usedamount=" + usedamount
				+ ", availableamount=" + availableamount + ", installment=" + installment + "]";
	}

	
	
	
}
