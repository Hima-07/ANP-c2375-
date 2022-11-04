package com.anudip.lab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "Lib_detail")
public class Library {
	
	@Id
	@Column(length  =3,nullable = false)
	@NotNull(message = "Id can't be Empty")
	private int bookId;
	
	@Column(length = 20,nullable = false)
	@NotNull(message="Name can't be Empty")
	private String bookName;
	
	@Column(length  =20,nullable = false)
	@NotNull(message = "Author Name can't be Empty")
	private String bookAuthor;
	
	@Column(length  =3,nullable = false)
	@NotNull(message = "Price can't be Empty")
	private double bookPrice;

}
