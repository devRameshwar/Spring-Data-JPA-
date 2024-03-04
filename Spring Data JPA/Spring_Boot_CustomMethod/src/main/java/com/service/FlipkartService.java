package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entity.Flipkart;
import com.repository.ProductRepository;

@Component
public class FlipkartService {

	@Autowired
	private ProductRepository repository;

	public void addProduct() {
		// creating object Entity class
		Flipkart flipkart = new Flipkart();

		// setting the value
		flipkart.setProductId("104");
		flipkart.setProductName("Bagan");
		flipkart.setProductQty(15);
		flipkart.setPrice(130);

		// calling JpaRepository save method
		repository.save(flipkart);
		System.out.println("Flipkart Product Added...");

	}

	// Retrieve All data to database using find all method
	public void getAllProduct() {
		List<Flipkart> product = repository.findAll();
		product.forEach(System.out::println);
	}

	// custom method findByQty
	public void findbyQty() {
		List<Flipkart> qty = repository.findByProductQty(20);
		qty.forEach(System.out::println);
	}

	// custom method findByName
	public void findByname() {
		Flipkart productName = repository.findByProductNameIgnoreCase("i-Phone");
		System.out.println(productName);
		System.out.println();
	}

	// calling custom method findByPriceAndName
	public void findByPriceAndName() {
		List<Flipkart> list = repository.findByPriceAndProductNameIgnoreCase(150000, "i-phone");
		list.forEach(System.out::println);
	}
	
	//calling custom method delete by name
	public void deleteById() {
		 repository.deleteById("101");
		 System.out.println("Item deleted..");
	}

}
