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
public class Project {
	
	@Id
	private int pId;
	
	@Column(length = 30,nullable = false,unique = true)
	private String pName;
	
	@Column(length  = 15,nullable = false)
	private String planguage;
	
	@ManyToMany(mappedBy = "proj")
	private List<Employee> emp;

}
