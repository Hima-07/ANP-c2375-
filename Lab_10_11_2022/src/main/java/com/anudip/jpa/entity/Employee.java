package com.anudip.jpa.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	private int eId;
	
	@Column(length = 20,nullable = false)
	private String eName;
	
	@Column(length = 10,nullable = false)
	private String eGender;
	
	@ManyToMany
	private List<Project> proj;

}
