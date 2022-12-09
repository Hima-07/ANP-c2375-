package com.anudip.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eId;
	
	@Column(length=20,nullable=false)
	private String eFirstName;
	
	@Column(length=20,nullable=false)
	private String eLastName;
	
	@Column(length=12,nullable=false,unique=true)
	private long eNumber;
	
	@Column(length=20,nullable=false,unique=true)
	@Email(message="Plz Enter Valid Email Address")
	@NotBlank(message="Plz Fill the Email before proceeding forward")
	private String eEmail;
	
}
