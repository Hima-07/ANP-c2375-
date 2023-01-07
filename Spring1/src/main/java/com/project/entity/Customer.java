package com.project.entity;

import java.util.List;  

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
@Table(name = "Customer_Info")
public class Customer {

	@Id
	private int cId;
	
	
	

	@Column(length =25,nullable=false)
	private String cName;
	
	@NotNull(message="Enter contact Number")
	private long cNumber;
	
	@Column(length =25,nullable=false)
	private String cEmail;
	
	@Column(length =40,nullable=false)
	private String cAdress;
	
	@OneToMany(fetch = FetchType.EAGER , mappedBy = "customer" , cascade = CascadeType.ALL )
	@JsonManagedReference
	private List<Product> product;
	
	public Customer(int cId, String cName, @NotNull(message = "Enter contact Number") long cNumber, String cEmail,
			String cAdress, List<Product> product) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cNumber = cNumber;
		this.cEmail = cEmail;
		this.cAdress = cAdress;
		this.product = product;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
