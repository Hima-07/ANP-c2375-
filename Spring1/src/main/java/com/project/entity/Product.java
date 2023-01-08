package com.project.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@Table(name="product_info")
public class Product {
	
	@Id
	private int pId;
	
	@Column(length=15,nullable=false)
	private String pName;
	
	@Column(nullable=false)
	private int pPrize;
	
	@Column(length=15,nullable=false)
	private String pDealer;
	
	@Column(length=15,nullable=false)
	private String pType;
	
	@Column(length=35,nullable=false)
	private String pDescription;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER )
	@JoinColumn(referencedColumnName = "cId" , name= "cId" )
	@JsonBackReference
	private Customer customer;

	public Product(int pId, String pName, int pPrize, String pDealer, String pType, String pDescription,
			Customer customer) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrize = pPrize;
		this.pDealer = pDealer;
		this.pType = pType;
		this.pDescription = pDescription;
		this.customer = customer;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
