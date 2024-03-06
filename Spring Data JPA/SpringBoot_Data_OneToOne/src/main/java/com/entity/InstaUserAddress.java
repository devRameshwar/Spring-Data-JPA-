package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "inta_user_address")
@Entity
@Data
public class InstaUserAddress {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;

	@Column
	private String city;

	@Column
	private String state;

	@Column
	private String distric;

	@Column
	String pincode;

	@Column
	String country;

}
