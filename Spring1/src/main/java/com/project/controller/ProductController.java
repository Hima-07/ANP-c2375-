package com.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Product;
import com.project.service.ProductService;

//Rest controller for Handling all incoming request from rest APi
@RestController
public class ProductController {

	@Autowired
	ProductService pServ;

	// save Product detail using post mapping
	@PostMapping("/saveP")
	public ResponseEntity<Product> saveP(@RequestBody @Valid Product product) {
		return new ResponseEntity<Product>(pServ.saveProduct(product), HttpStatus.OK);
	}

	// fetching Product By Product Id by using Get mapping
	@GetMapping("/getByIdProduct/{pId}")
	public ResponseEntity<Product> getById(@PathVariable("pId") int pId) {
		return new ResponseEntity<Product>(pServ.getProductById(pId), HttpStatus.OK);
	}

	// Updating Product Details by using Put mapping
	@PutMapping("/updateByIdProduct/{pId}")
	public ResponseEntity<Product> updateById(@PathVariable("pId") int pId, @RequestBody Product product) {
		return new ResponseEntity<Product>(pServ.updateProductById(pId,product), HttpStatus.OK);
	}

	// Delete Product Details by using Delete mapping
	@DeleteMapping("/deleteByIdProduct/{pId}")
	public ResponseEntity<String> deleteById(@PathVariable("pId") int pId) {
		pServ.deleteProductById(pId);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}

	// Fetching Product details by product Dealer using Get Mapping
	@GetMapping("/getBydProductDealer/{pDealer}")
	public List<Product> getByDealer(@PathVariable("pDealer") String pDealer) {
		return pServ.getProductByDealer(pDealer);
	}

	// fetching all product Details by get mapping
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct() {
		return pServ.displayAllProduct();
	}
}