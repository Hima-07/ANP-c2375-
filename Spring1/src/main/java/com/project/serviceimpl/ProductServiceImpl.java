package com.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Product;
import com.project.exception.ProductNotFoundException;
import com.project.repository.ProductRepository;
import com.project.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository pRepo;
	
	//Adding New Product Details By Save Operation
	@Override
	public Product saveProduct(Product product) {
		return pRepo.save(product);
	}

	//Fetching Product Details By Product Id
	@Override
	public Product getProductById(int pId) {
		return pRepo.findById(pId).orElseThrow(() -> new ProductNotFoundException("Entred Product Id is not present in Database"));
	}

	//Updating Product Details finding by Product Id 
	@Override
	public Product updateProductById(int pId, Product product) {
		Product p = pRepo.findById(pId).orElseThrow(() -> new ProductNotFoundException("Entred Product Id is not present in Database"));
		
		p.setPPrize(p.getPPrize());
		pRepo.save(p);
		return p;
	}

	//Deleting Product Details By Product Id
	@Override
	public void deleteProductById(int pId) {
		pRepo.findById(pId).orElseThrow(() -> new ProductNotFoundException("Entred Product Id is not present in Database"));
		pRepo.deleteById(pId);
	}

	//Fetching All Product Details by find All Operation
	@Override
	public List<Product> displayAllProduct() {
		return pRepo.findAll();
	}

	//Fetching Product Details By Product Dealer
	@Override
	public List<Product> getProductByDealer(String pDealer) {
		return pRepo.getByProductDealer(pDealer);
	}



}
