package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Table(name = "flipkart_custom")
@Entity
@AllArgsConstructor
public class Flipkart {

	@Id
	@Column
	private String productId;

	@Column
	private String productName;

	@Column
	private double price;

	@Column
	private Integer productQty;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getProductQty() {
		return productQty;
	}

	@Override
	public String toString() {
		return "Flipkart [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", productQty=" + productQty + "]";
	}

	public void setProductQty(Integer productQty) {
		this.productQty = productQty;
	}
	
	

}
