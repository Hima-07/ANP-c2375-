package com.project.service;

import java.util.List;

import com.project.entity.Product;

public interface ProductService  {
	
	//method for Saving Product Detail
	Product saveProduct(Product product);
	
	//method for Fetching Product Detail by Id
	Product  getProductById (int pId);
	
	//method for Updating Product Detail By Id
	Product updateProductById(int pId , Product product);
	
	//method for Deleting Product Detail By Id
	void deleteProductById(int pId);
	
	//method for Fetching all Product Detail 
	List<Product> displayAllProduct();
	
	//method for Fetching Product Detail By Dealer
	List<Product> getProductByDealer(String pDealer);

}
