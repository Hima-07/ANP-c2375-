package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query("Select p from Product p where p.pDealer =?1")
	public List<Product > getByProductDealer(String pDealer);

}
