package com.example.bumblebeecompanymanagement.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String pname;
	private String pprice;
	private String pdescription;
	private String pcategory;
	private String pbrand;
	
	public Product() {


	}
	
	
	
	public Product(Long id, String pname, String pprice, String pdescription, String pcategory, String pbrand) {

		this.id = id;
		this.pname = pname;
		this.pprice = pprice;
		this.pdescription = pdescription;
		this.pcategory = pcategory;
		this.pbrand = pbrand;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPprice() {
		return pprice;
	}
	public void setPprice(String pprice) {
		this.pprice = pprice;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public String getPcategory() {
		return pcategory;
	}
	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}
	public String getPbrand() {
		return pbrand;
	}
	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", pprice=" + pprice + ", pdescription=" + pdescription
				+ ", pcategory=" + pcategory + ", pbrand=" + pbrand + "]";
	}
	
	
	
	
}
