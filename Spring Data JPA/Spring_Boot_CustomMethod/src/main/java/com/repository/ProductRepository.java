package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Flipkart;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Flipkart, String> {

	//Custom method findBy flipkart product by Quantity
	List<Flipkart> findByProductQty(Integer qty);
	
	//Custom method findBy flipkart product by name
	Flipkart findByProductNameIgnoreCase(String name);
	
	//Custom method findBy flipkart product by name and price
	List<Flipkart> findByPriceAndProductNameIgnoreCase(double price,String name);
	

}
